package com.example;

import com.example.Money.Money;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    private Money f12chf;
    private Money f14chf;

    @Before
    public void setUp() throws Exception {
        f12chf = new Money(12,"chf");
        f14chf = new Money(14,"chf");
    }

    @Test
    public void add() {
        assertEquals("amount not equals",26,f12chf.add(f14chf));
    }
}

