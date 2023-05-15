package com.ws.behavioral.chainOfResponsibility.example1;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
