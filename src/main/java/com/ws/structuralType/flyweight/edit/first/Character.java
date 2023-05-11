package com.ws.structuralType.flyweight.edit.first;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 16:03
 * @Version 1.0
 */
public class Character {//文字
    private char c;
    private Font font;
    private int size;
    private int colorRGB;

    public Character(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}

