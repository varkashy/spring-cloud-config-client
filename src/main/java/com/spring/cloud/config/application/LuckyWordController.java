package com.spring.cloud.config.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    String luckyWord;

    @GetMapping("/lucky-word")
    public String getLuckyWord(){
        return "the lucky word is "+luckyWord;
    }
}
