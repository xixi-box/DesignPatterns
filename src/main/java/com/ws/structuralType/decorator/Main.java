package com.ws.structuralType.decorator;

/**
 * @Author: 王顺
 * @Date: 2023/5/9 17:02
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world!");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(new FullBorder(
                                                new StringDisplay("你好，世界！")), '*'))), '#');
        b4.show();

    }
}
