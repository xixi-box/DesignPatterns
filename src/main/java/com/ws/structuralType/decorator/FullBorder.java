package com.ws.structuralType.decorator;

/**
 * @Author: 王顺
 * @Date: 2023/5/9 16:48
 * @Version 1.0
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    /**
     * @return
     */
    @Override
    public int getColumns() {//字符数为被装饰物的字符数加上两侧边框字符数
        return 1 + display.getColumns() + 1;
    }

    /**
     * @return
     */
    @Override
    public int getRows() {//行数为被装饰物的行数加上上下边框的行数
        return 1 + display.getRows() + 1;
    }

    /**
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {//指定哪一行的字符串
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";//上边框
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";//下边框
        } else {
            return "|" + display.getRowText(row - 1) + "|";//其他边框
        }
    }

    private String makeLine(char ch, int count) {//生成一个重复count 次字符ch 的字符串
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(ch);
        }
        return stringBuffer.toString();
    }
}
