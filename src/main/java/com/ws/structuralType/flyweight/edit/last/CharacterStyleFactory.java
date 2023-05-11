package com.ws.structuralType.flyweight.edit.last;

import com.ws.structuralType.flyweight.edit.first.Font;

import java.util.ArrayList;
import java.util.List;

/**
 * 预先生产并存储统一标准的字体
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
