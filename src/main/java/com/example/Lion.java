package com.example;

import java.util.List;

public class Lion {

    private final Feline feline;
    private boolean hasMane;


    Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            // Ошибка в слове самец - самей допущена автором, тест на эксепшен будет падать.
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    int getKittens() {
        return feline.getKittens();
    }

    boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}

