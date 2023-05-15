package com.ws.behavioral.chainOfResponsibility.example3;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 14:38
 * @Version 1.0
 */
public abstract class Handler {
    //successor就是后继指针
    protected Handler successor = null;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public final void handle() {
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }
    protected abstract void doHandle();
}
