package com.example.monopoly.model;

import java.util.Objects;

public class Player {

    private double pocketMoney;
    private String name;
    private int position;

    public Player(String name) {
        this.pocketMoney = 1500;
        this.name = name;
        this.position = 0;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(int diceResult){
        this.position += diceResult;
    }

}
