package com.example.monopoly.model;

public class FreeParking extends Space {
    public FreeParking(String name, String text) {
        super(name, text);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getText() {
        return super.text;
    }
}
