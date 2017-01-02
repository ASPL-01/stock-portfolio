package com.chyld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ClientTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateClient() throws Exception {
        Client client = new Client("Molly", 25, "Female");
        assertEquals("Molly", client.getName());
        assertEquals(0, client.getCash(), 0.1);
    }

    @Test
    public void shouldDepositFunds() throws Exception {
        Client client = new Client("Molly", 25, "Female");
        client.deposit(500);
        assertEquals(500, client.getCash(), 0.1);
    }

    @Test
    public void shouldWithdrawFunds() throws Exception {
        Client client = new Client("Molly", 25, "Female");
        client.deposit(500);
        client.withdraw(200);
        assertEquals(300, client.getCash(), 0.1);
    }

    @Test
    public void shouldNotWithdrawFundsNotEnoughMoney() throws Exception {
        Client client = new Client("Molly", 25, "Female");
        client.deposit(500);
        client.withdraw(510);
        assertEquals(500, client.getCash(), 0.1);
    }

    @Test
    public void shouldBeAbleToPurchaseStock() throws Exception {
        Client client = new Client("Molly", 25, "Female");
        client.deposit(1000);
        client.buyStock("AAPL", 5, "Technology");
        assertEquals(1, client.numberOfPortfolios());
        Portfolio portfolio = client.getPortfolio("Technology");
        Stock stock = portfolio.getStock("AAPL");
        assertEquals(stock.getPurchasePrice(), 1000 - client.getCash(), 0.1);
        assertEquals(5, stock.getShares());
    }
}
