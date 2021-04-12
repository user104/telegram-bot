package me.t.mylazybot.controllers;

import me.t.mylazybot.model.GetUpdate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        GetUpdate update = new GetUpdate();
        update.getMeRequest();
        return "Greetings from Spring Boot111";
    }
}
