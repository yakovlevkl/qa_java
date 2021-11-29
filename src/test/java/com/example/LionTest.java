package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {
    private Feline feline = new Feline();
    private final Lion lion = new Lion("Самка", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void eatMeat() throws Exception {
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void doesHaveMane() {
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testExceptionLionSex() {
        try {
            Lion lionSex = new Lion("Оно", feline);
            System.out.println(lionSex);
        } catch (Exception InvalidSexName) {
            // Test will fall everytime because exception have spelling error
            // самей correct: самец
            assertEquals(InvalidSexName.getMessage(),
                    "Используйте допустимые значения пола животного - самей или самка");
        }
    }

    @Test
    public void testGetKittens() {
        assertEquals(lion.getKittens(), 1);
    }

}