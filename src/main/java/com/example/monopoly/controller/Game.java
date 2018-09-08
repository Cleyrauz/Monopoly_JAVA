package com.example.monopoly.controller;

import com.example.monopoly.model.Dice;
import com.example.monopoly.model.Player;
import com.example.monopoly.model.board.Board;

public class Game {

    private Board board;
    private Player[] players;
    private Dice dice;

    public Game() {
        this.board = new Board();
        this.players = new Player [2];
        this.dice = new Dice(6);
    }

    public Player[] setUpPlayers(String namePlayer1, String namePlayer2){
        players[0] = new Player(namePlayer1);
        players[1] = new Player(namePlayer2);

        return players;
    }

    public Player whoPlayFirst(int resultPlayer1, int resultPlayer2){
        if (resultPlayer1 == resultPlayer2) {
            System.out.println("Roll the dice again! The values are equals.");
            return null;
        }
            System.out.println("Player 1 roll the dice " + resultPlayer1);
            System.out.println("Player 2 roll the dice " + resultPlayer2);
            return resultPlayer1 > resultPlayer2 ? players[0] : players[1];
    }
}
