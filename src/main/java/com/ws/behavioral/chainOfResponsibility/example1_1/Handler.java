package com.ws.behavioral.chainOfResponsibility.example1_1;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 14:30
 * @Version 1.0
 */
public abstract class Handler {
    protected Handler successor = null;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }
    protected abstract boolean doHandle();
}
