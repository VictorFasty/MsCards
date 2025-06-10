package com.io.github.victornext.msCardService.application;

import com.io.github.victornext.msCardService.domain.Card;
import com.io.github.victornext.msCardService.infra.repository.CardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository repository;


    @Transactional
    public Card save(Card card){
        return repository.save(card);
    }

    public List<Card> getCardByIncomeOrLow(Long renda){
        var incomeBigDecimal = BigDecimal.valueOf(renda);
        return repository.findByIncomeLessThanEqual(incomeBigDecimal);
    }



    }
