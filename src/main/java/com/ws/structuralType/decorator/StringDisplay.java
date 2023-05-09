package com.ws.structuralType.decorator;

/**
 * @Author: 王顺
 * @Date: 2023/5/9 16:22
 * @Version 1.0
 */
public class StringDisplay extends Display {
    private String string;//要显示的字符串

    public StringDisplay(String string) {//通过参数传入要显示的字符串
        this.string = string;
    }

    @Override
    public int getColumns() {//字符数
        return string.getBytes().length;
    }

    @Override
    public int getRows() {//行数是1
        return 1;
    }

    @Override
    public String getRowText(int row) {//仅当r ow 为0 时返回值
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
