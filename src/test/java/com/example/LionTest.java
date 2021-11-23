package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {
    private Lion lion = new Lion("Самка");

    public LionTest() throws Exception {
    }

    @Test
    public void eatMeat() throws Exception {
        assertEquals(lion.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamily() {
        assertEquals(lion.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittens() {
        assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void doesHaveMane() {
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testExceptionLionSex() {
        try {
            Lion lionSex = new Lion("Оно");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"Используйте допустимые значения пола животного - самей или самка");
        }
    }

}