package com.ws.behavioral.chainOfResponsibility.example1;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 14:19
 * @Version 1.0
 * @Description 第一种职责链模式
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
