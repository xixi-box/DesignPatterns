package com.ws.structuralType.decorator;

/**
 * @Author: 王顺
 * @Date: 2023/5/8 17:31
 * @Version 1.0
 */
public abstract class Display {
    public abstract int getColumns();//获取横向字符数


    public abstract int getRows();//获取纵向行数

    public abstract String getRowText(int row);//获取第row 行的字符串

    public final void show() {  //全部显示
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
