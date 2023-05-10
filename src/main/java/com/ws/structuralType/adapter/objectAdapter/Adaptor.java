package com.ws.structuralType.adapter.objectAdapter;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 14:36
 * @Version 1.0
 */
public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa(); //委托给Adaptee
    }

    public void f2() {
    //...重新实现f2()...
    }

    public void fc() {
        adaptee.fc();
    }
}
