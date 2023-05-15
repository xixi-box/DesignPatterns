package com.ws.behavioral.chainOfResponsibility.example1;

public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...本身的业务逻辑
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
