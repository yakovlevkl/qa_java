package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Lion lion;

    @Test
    public void eatMeat() throws Exception {
        lion.eatMeat();
        Mockito.verify(lion).eatMeat();
    }

    @Test
    public void getFamily() {
        lion.getFamily();
        Mockito.verify(lion).getFamily();
    }

    @Test
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void testGetKittens() {
        lion.getKittens(2);
        Mockito.verify(lion).getKittens(2);
    }

    @Test
    public void doesHaveMane() {
        lion.doesHaveMane();
        Mockito.verify(lion, Mockito.only()).doesHaveMane();
    }
}