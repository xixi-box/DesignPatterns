package com.ws.behavioral.templateMethod.example;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 16:56
 * @Version 1.0
 * @Description 模板模式
 */
public abstract class AbstractClass {
    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();

    protected abstract void method2();
}
