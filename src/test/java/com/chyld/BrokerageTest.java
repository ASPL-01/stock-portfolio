package com.chyld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrokerageTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateNewBrokerage() throws Exception {
        Brokerage brokerage = new Brokerage("ETrade");
        assertEquals("ETrade", brokerage.getName());
        assertEquals(0, brokerage.size());
    }

    @Test
    public void shouldAddClientToBrokerage() throws Exception {
        Brokerage brokerage = new Brokerage("ETrade");
        Client client = new Client("Molly", 20, "Female");
        brokerage.addClient(client);
        assertEquals(1, brokerage.size());
    }
}
