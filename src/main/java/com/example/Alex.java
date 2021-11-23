package com.example;

import net.bytebuddy.dynamic.scaffold.TypeInitializer;

import java.util.List;

public class Alex extends Lion {
    Alex() throws Exception {
        super("Самец");
    }

    List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
