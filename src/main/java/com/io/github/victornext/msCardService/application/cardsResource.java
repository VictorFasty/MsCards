package com.io.github.victornext.msCardService.application;

import com.io.github.victornext.msCardService.application.representation.CardSaveRequest;
import com.io.github.victornext.msCardService.domain.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class cardsResource {


    private final CardService service;



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
}
