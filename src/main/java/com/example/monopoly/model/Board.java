package com.example.monopoly.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Space> spaces;

    public Board() {
        this.spaces = new ArrayList<Space>();
        initiateBoard();
    }

    public List<Space> getSpaces() {
        return spaces;
    }

    private void initiateBoard() {
        spaces.add(new Street("Cumberland", "St"));
    }
}
