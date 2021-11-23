package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {
    private Alex alex = new Alex();

    public AlexTest() throws Exception {
    }

    @Test
    public void getFriends() {
        assertEquals(alex.getFriends(), List.of("Марти", "Глория", "Мелман"));
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals(alex.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }

    @Test
    public void getKittens() {
        assertEquals(alex.getKittens(), 0);
    }
}