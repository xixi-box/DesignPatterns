package com.ws.structuralType.flyweight.edit.last;

import com.ws.structuralType.flyweight.edit.first.Font;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 16:10
 * @Version 1.0
 * @Description 字体样式
 */
public class CharacterStyle {
    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    /**
     * @target
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        CharacterStyle otherStyle = (CharacterStyle) o;
        return font.equals(otherStyle.font) && size == otherStyle.size
                && colorRGB == otherStyle.colorRGB;
    }
}

