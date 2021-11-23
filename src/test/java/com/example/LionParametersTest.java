package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametersTest {
    private final int number;
    private final int numberExpected;

    public LionParametersTest(int number, int numberExpected) {
        this.number = number;
        this.numberExpected = numberExpected;
    }

    @Parameterized.Parameters
    public static Object[] getNumber() {
        return new Object[][] {
                { 1, 1 },
                { 2, 2 },
                { 0, 0 },
                { 10, 10 },
        };
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens(number);
        assertEquals(numberExpected, actual);
    }
}