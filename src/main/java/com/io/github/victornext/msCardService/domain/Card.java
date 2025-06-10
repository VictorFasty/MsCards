package com.io.github.victornext.msCardService.domain;

import com.io.github.victornext.msCardService.Enums.FlagCard;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private FlagCard flagCard;
    private BigDecimal income;
    private BigDecimal limitBasic;


    public Card(String name,
                FlagCard flagCard,
                BigDecimal income,
                BigDecimal limitBasic) {
        this.name = name;
        this.flagCard = flagCard;
        this.income = income;
        this.limitBasic = limitBasic;
    }


}
