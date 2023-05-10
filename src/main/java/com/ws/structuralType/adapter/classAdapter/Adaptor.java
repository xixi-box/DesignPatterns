package com.ws.structuralType.adapter.classAdapter;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 14:33
 * @Version 1.0
 */
public class Adaptor extends Adaptee implements ITarget {
    public void f1() {
        super.fa();
    }

    public void f2() {
        //...重新实现f2()...
    }

    @Override
    public void f3() {

    }
    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
