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


    public boolean roll() {
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        if (dice1 + dice2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDouble() {
        if (dice1 == dice2 ) {
            return true;
        }
        else {
            return false;
        }
    }

}

