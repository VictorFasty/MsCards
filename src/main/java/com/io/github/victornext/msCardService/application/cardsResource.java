package com.io.github.victornext.msCardService.application;

import com.io.github.victornext.msCardService.application.representation.CardPerClientResponse;
import com.io.github.victornext.msCardService.application.representation.CardSaveRequest;
import com.io.github.victornext.msCardService.domain.Card;
import com.io.github.victornext.msCardService.domain.ClientCard;
import com.netflix.discovery.converters.Auto;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class cardsResource {


    private final CardService service;
    private final ClientCardService clientCard;


    @GetMapping
    public String Status() {
        return "OK";
    }


    @PostMapping
    public ResponseEntity create(@RequestBody CardSaveRequest request){
        Card card = request.toModel();
        service.save(card);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(params = "income")
    public ResponseEntity<List<Card>> getCardsIncomeLimit(@RequestParam("income") Long income){
        List<Card> cards = service.getCardByIncomeOrLow(income);
        return ResponseEntity.ok(cards);
    }


    @GetMapping(params = "cpf")
    public ResponseEntity<List<CardPerClientResponse>> getCardsByClient(@RequestParam("cpf") String cpf){
        List<ClientCard> list = clientCard.listCardsByCpf(cpf);
        List<CardPerClientResponse> resultList = list.stream().map(CardPerClientResponse::fromModel).collect(Collectors.toList());


        return ResponseEntity.ok(resultList);
    }

}
