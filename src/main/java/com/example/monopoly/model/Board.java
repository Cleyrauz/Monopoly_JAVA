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
        spaces.add(new Go("Go", "Collect M200 salary as you pass!"));
        spaces.add(new Street("Old Kent Road", "60"));
        spaces.add(new CommunityChest("Community Chest I", "Pick a card!"));
        spaces.add(new Street("White Chapel Road", "M60"));
        spaces.add(new Tax("Income Tax", "Pay M200"));
        spaces.add(new Service("Kings Cross Station", "M200"));
        spaces.add(new Street("The Angel Islington", "M100"));
        spaces.add(new Chance("Chance I", "?"));
        spaces.add(new Street("Euston Road", "M100"));
        spaces.add(new Street("Pentonville Road", "M120"));
        spaces.add(new GoToJail("In Jail", "Just visiting"));
        spaces.add(new Street("Pall Mall", "M140"));
        spaces.add(new Service("Electric Company", "M150"));
        spaces.add(new Street("WhiteHall", "M140"));
        spaces.add(new Street("Northumberland Avenue", "M160"));
        spaces.add(new Service("Marylebone Station", "M200"));
        spaces.add(new Street("Bow Street", "M180"));
        spaces.add(new CommunityChest("Community Chest II", "Pick a card!"));
        spaces.add(new Street("Marlborough street", "M180"));
        spaces.add(new Street("Vine Street", "M200"));
        spaces.add(new FreeParking("Free Parking", "Collect the money!"));
        spaces.add(new Street("Strand", "M220"));
        spaces.add(new Chance("Chance II", "?"));
        spaces.add(new Street("Fleet Street", "M220"));
        spaces.add(new Street("Trafalgar Square", "M240"));
        spaces.add(new Service("Fenchurch St. Station", "M200"));
        spaces.add(new Street("Leicester Square", "M260"));
        spaces.add(new Street("Coventry Street", "M260"));
        spaces.add(new Service("Water Works", "M150"));
        spaces.add(new Street("Piccadilly", "M280"));
        spaces.add(new GoToJail("Go To Jail", "Bad luck!"));
        spaces.add(new Street("Regent Street", "M300"));
        spaces.add(new Street("Oxford Street", "M300"));
        spaces.add(new CommunityChest("Community Chest III", "Pick a card!"));
        spaces.add(new Street("Bond Street", "M320"));
        spaces.add(new Service("Liverpool St. Station", "M200"));
        spaces.add(new Chance("Chance III", "?"));
        spaces.add(new Street("Park Line", "M320"));
        spaces.add(new Tax("Super Tax", "Pay M100"));
        spaces.add(new Street("Mayfair", "M400"));
    }
}
