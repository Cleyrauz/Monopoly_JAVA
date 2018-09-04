package com.example.monopoly.model;

public class Player {

    private double pocketMoney;
    private String name;

    public Player(String name) {
        this.pocketMoney = 1500;
        this.name = name;
    }

    public double getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(double pocketMoney) {
        this.pocketMoney = pocketMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
