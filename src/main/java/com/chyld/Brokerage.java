package com.chyld;

import java.util.ArrayList;
import java.util.List;

public class Brokerage {
    private String name;
    private List<Client> clients;

    public Brokerage(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public int size(){
        return this.clients.size();
    }
}
