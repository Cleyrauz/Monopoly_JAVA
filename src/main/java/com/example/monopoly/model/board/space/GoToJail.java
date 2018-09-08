package com.example.monopoly.model.board.space;

import com.example.monopoly.model.board.space.Space;

public class GoToJail extends Space {
    public GoToJail(String name, String text) {
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
