package com.example.monopoly.model;

public class Tax extends Space {
    public Tax(String name, String text) {
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
