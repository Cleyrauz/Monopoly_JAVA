package com.example.monopoly.model;

public class Dice {

    private int dice1;
    private int dice2;

    public Dice() {
        this.dice1 = 0;
        this.dice2 = 0;
    }

    public int getDiceValue() {
        return dice1 + dice2;
    }


}

