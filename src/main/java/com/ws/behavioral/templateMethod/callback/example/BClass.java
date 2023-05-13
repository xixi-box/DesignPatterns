package com.ws.behavioral.templateMethod.callback.example;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 17:16
 * @Version 1.0
 */
public class BClass {
    public void process(ICallback callback) {
        //...
        callback.methodToCallback();
        //...
    }
}
