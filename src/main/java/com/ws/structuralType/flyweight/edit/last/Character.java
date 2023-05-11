package com.ws.structuralType.flyweight.edit.last;

/**
 * 字体的规格
 */
public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
