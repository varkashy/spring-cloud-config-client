package com.spring.cloud.config.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@ConfigurationProperties
public class LuckyWordController {

    String luckyWord;

    /*@Value("${lucky-word}")
    String luckyWord;*/

    @GetMapping("/lucky-word")
    public String showLuckyWord(){
        return "the lucky word is "+luckyWord;
    }
    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }
}
