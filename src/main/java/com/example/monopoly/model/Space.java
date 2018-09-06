package com.example.monopoly.model;

public abstract class Space {
    private String name;
    private String text;

    public Space(String name, String text) {
        this.name = name;
        this.text = text;
    }

    //Only getters because I can not change the text or name of the space after instantiation

    public abstract String getName();

    public abstract String getText();

}
