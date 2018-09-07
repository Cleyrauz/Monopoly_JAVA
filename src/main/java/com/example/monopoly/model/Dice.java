package com.example.monopoly.model;

public class Dice {

    private int dice1;
    private int dice2;
    private int dieSides;

    public Dice(int dieSides) {
        if(dieSides <= 0 || dieSides > 6){
            throw new IllegalArgumentException("The Sides of the dice can't be 0 or less than 0 or grater than 6");
        }
        this.dice1 = 0;
        this.dice2 = 0;
        this.dieSides = dieSides;
    }

    public int getDiceValue() {
        return dice1 + dice2;
    }


    public void roll() {
        dice1 = (int) (Math.random() * dieSides) + 1;
        dice2 = (int) (Math.random() * dieSides) + 1;
    }

    public boolean isDouble() {
        return dice1 == dice2 && dice1 + dice2 != 0;
    }

}
