package com.io.github.victornext.msCardService.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
public class cardsResource {
    @GetMapping
    public String Status() {
        return "OK";
    }

}
