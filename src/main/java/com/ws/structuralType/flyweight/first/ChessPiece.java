package com.ws.structuralType.flyweight.first;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 15:45
 * @Version 1.0
 */
public class ChessPiece {
    private int id;
    private String text;
    private Color color;
    private int positionX;
    private int positionY;

    public ChessPiece(int id, String text, Color color, int positionX, int positi) {
        this.id = id;
        this.text = text;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionX;
    }

    public static enum Color {
        RED, BLACK
    }
    // ...省略其他属性和getter/setter方法...
}
