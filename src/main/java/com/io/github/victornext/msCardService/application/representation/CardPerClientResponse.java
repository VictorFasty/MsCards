package com.io.github.victornext.msCardService.application.representation;

import com.io.github.victornext.msCardService.Enums.FlagCard;
import com.io.github.victornext.msCardService.domain.ClientCard;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CardPerClientResponse {
    private String name;
    private FlagCard flagCard;
    private BigDecimal limit;


    public CardPerClientResponse(String name, FlagCard flagCard, BigDecimal limit) {
        this.name = name;
        this.flagCard = flagCard;
        this.limit = limit;
    }

    public static CardPerClientResponse fromModel(ClientCard model) {
        return new CardPerClientResponse(
                model.getCard().getName(),
                model.getCard().getFlagCard(),
                model.getAprovedLimit()
        );
    }
}
