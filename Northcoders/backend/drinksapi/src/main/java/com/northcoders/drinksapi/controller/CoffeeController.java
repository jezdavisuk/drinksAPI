package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController()
@RequestMapping("/")
public class CoffeeController {

    @GetMapping("/coffeelover")
    public String coffeeLover(){
        return "I like coffee!";
    }

//    @GetMapping("/coffee")
//    public HashMap<String,Object> coffee(@RequestParam(value="name",defaultValue = "latte") String name){
//        Integer id_count = 1;
//        HashMap<String,Object> coffeeLog = new HashMap<>();
//        coffeeLog.put("id", id_count++);
//        coffeeLog.put("name", name);
//        return coffeeLog;
//    }

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value="name",defaultValue = "latte") String name){
       Coffee coffeeLog = new Coffee(name);
        return coffeeLog;
    }
}
