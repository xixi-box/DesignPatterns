package com.ws.structuralType.decorator;

/**
 * @Author: 王顺
 * @Date: 2023/5/9 16:37
 * @Version 1.0
 */
public class SideBorder extends Border {
    private char borderChar;//表示装饰边框的字符
    //通过构造函数指定Display和装饰边框字符
    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {//字符数为字符串字符数加上两侧边框字符数
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();//行数就是被装饰物的行数
    }

    @Override
    public String getRowText(int row) {//指定的那一行的字符串为被装饰物的字符串加上两侧的边框的字符
        return borderChar + display.getRowText(row) + borderChar;
    }
}
