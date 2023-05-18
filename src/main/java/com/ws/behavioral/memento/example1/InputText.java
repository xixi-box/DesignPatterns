package com.ws.behavioral.memento.example1;

/**
 * @Author: 王顺
 * @Date: 2023/5/18 16:16
 * @Version 1.0
 */
public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}

