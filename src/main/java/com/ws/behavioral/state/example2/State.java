package com.ws.behavioral.state.example2;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 15:19
 * @Version 1.0
 */
public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);
    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

