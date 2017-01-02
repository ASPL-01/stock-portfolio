package com.chyld;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private String name;
    private Map<String, Stock> stocks;

    public Portfolio(String name) {
        this.name = name;
        this.stocks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStock(Stock s){
        stocks.put(s.getSymbol(), s);
    }

    public Stock getStock(String symbol){
        return this.stocks.get(symbol);
    }

    public int size(){
        return this.stocks.size();
    }
}
