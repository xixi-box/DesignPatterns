package com.ws.behavioral.state.example2;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 15:28
 * @Version 1.0
 */
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);
    private int value;

    private Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
