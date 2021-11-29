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
        } catch (Exception InvalidSexName) {
            // Test will fall everytime because exception have spelling error
            assertEquals(InvalidSexName.getMessage(),
                    "Используйте допустимые значения пола животного - самец или самка");
        }
    }

}