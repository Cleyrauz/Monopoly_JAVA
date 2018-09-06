package com.example.monopoly.model;

import java.util.ArrayList;

public class Board {

    private ArrayList<Space> spaces;

    public Board() {
        this.spaces = new ArrayList<Space>();
    }

    public ArrayList<Space> getSpaces() {
        return spaces;
    }

    public void setSpaces(ArrayList<Space> spaces) {
        this.spaces = spaces;
    }
}
