package com.northcoders.drinksapi.model;

import java.util.concurrent.atomic.AtomicLong;

public class Coffee {

    static long id;
    String name;
    static AtomicLong counter = new AtomicLong();


    public Coffee(String name) {
        this.id = counter.getAndIncrement();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
