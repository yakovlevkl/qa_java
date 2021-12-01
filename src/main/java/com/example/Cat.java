package com.example;

import java.util.List;

public class Cat {

    private Predator predator;

    Cat(Feline feline) {
        this.predator = feline;
    }

    String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
