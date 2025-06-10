package com.io.github.victornext.msCardService.application.representation;

import com.io.github.victornext.msCardService.Enums.FlagCard;
import com.io.github.victornext.msCardService.domain.Card;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CardSaveRequest {
    private String name;
    private FlagCard flag;
    private BigDecimal income;
    private BigDecimal limit;


    public Card toModel(){
        return new Card(name, flag, income, limit);
    }

}
