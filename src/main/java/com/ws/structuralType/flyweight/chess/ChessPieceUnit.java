package com.ws.structuralType.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 15:49
 * @Version 1.0
 */
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }
    // ...省略其他属性和getter方法...
}

