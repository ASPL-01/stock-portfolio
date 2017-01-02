package com.chyld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PortfolioTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldCreateANewPortfolioObject() throws Exception {
        Portfolio p = new Portfolio("Tech");
        assertEquals("Tech", p.getName());
        assertEquals(0, p.size());
    }

    @Test
    public void shouldAddStockToPortfolio() throws Exception {
        Portfolio p = new Portfolio("Tech");
        Stock s = new Stock("AAPL", 5, 100);
        p.addStock(s);
        assertEquals(1, p.size());
    }

    @Test
    public void shouldGetStockFromPortfolio() throws Exception {
        Portfolio p = new Portfolio("Tech");
        Stock s1 = new Stock("AAPL", 5, 100);
        Stock s2 = new Stock("GOOG", 7, 100);
        p.addStock(s1);
        p.addStock(s2);
        assertEquals("AAPL", p.getStock("AAPL").getSymbol());
    }
}
