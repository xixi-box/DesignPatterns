package com.ws.structuralType.flyweight.edit.last;

import com.ws.structuralType.flyweight.edit.first.Font;

import java.util.ArrayList;
import java.util.List;

/**
 * 编辑器
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
