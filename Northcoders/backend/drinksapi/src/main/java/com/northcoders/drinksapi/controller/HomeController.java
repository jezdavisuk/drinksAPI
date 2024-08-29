package com.northcoders.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController()
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "Welcome to the Drinks API!";
    }

    @GetMapping("/coffeelover")
    public String coffeeLover(){
        return "I like coffee!";
    }

    @GetMapping("/coffee")
    public HashMap<String,Object> coffee(@RequestParam(value="name",defaultValue = "latte") String name){
        Integer id_count = 1;
        HashMap<String,Object> coffeeLog = new HashMap<>();
        coffeeLog.put("id", id_count++);
        coffeeLog.put("name", name);
        return coffeeLog;
    }
}
