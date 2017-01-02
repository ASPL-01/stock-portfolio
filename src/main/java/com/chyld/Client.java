package com.chyld;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private String name;
    private int age;
    private String gender;
    private double cash;
    private Map<String, Portfolio> portfolios;

    public Client(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cash = 0;
        this.portfolios = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getCash() {
        return cash;
    }

    public void deposit(double amount){
        this.cash += amount;
    }

    public void withdraw(double amount){
        if(amount <= this.cash){
            this.cash -= amount;
        }
    }

    public void buyStock(String symbol, int shares, String portfolioName){
        double quote = Stock.quote(symbol);
        double amount = quote * shares;
        if(amount <= this.cash){
            this.cash -= amount;
            Stock stock = new Stock(symbol, shares, amount);
            Portfolio portfolio = this.portfolios.get(portfolioName);
            if(portfolio == null){
                portfolio = new Portfolio(portfolioName);
                this.portfolios.put(portfolioName, portfolio);
            }
            portfolio.addStock(stock);
        }
    }

    public int numberOfPortfolios(){
        return this.portfolios.size();
    }

    public Portfolio getPortfolio(String name){
        return this.portfolios.get(name);
    }
}
