package com.chyld;

public class Stock {
    private String symbol;
    private int shares;
    private double purchasePrice;

    public Stock(String symbol, int shares, double purchasePrice) {
        this.symbol = symbol;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getShares() {
        return shares;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setShares(int amount) {
        this.shares = amount;
    }

    public static double quote(String symbol){
        return (Math.random() * 90) + 10;
    }
}
