package com.chyld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldCreateANewStockObject() throws Exception {
        Stock s = new Stock("AAPL", 5, 100);
        assertEquals("AAPL", s.getSymbol());
        assertEquals(5, s.getShares());
        assertEquals(100, s.getPurchasePrice(), 0.1);
    }
}
