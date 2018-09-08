package com.example.monopoly.controller;

import com.example.monopoly.model.Dice;
import com.example.monopoly.model.Player;
import com.example.monopoly.model.board.Board;

public class Game {

    private Board board;
    private Player[] players;
    private Dice dice;

    public Game(Board board, Player[] players, Dice dice) {
        this.board = new Board();
        this.players = new Player [2];
        this.dice = new Dice(6);
    }

    public void startGame(){


    }

}
