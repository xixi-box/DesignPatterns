package com.ws.structuralType.adapter.use.u3;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 15:24
 * @Version 1.0
 */
// 将外部系统A替换成外部系统B
public class BAdaptor implements IA {
    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    public void fa() {
        //...
        b.fb();
    }
}
