package com.ws.structuralType.adapter.use.u3;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 15:26
 * @Version 1.0
 */
public class test {
    public void test() {
        Demo d = new Demo(new A());
        // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
// 只需要将BAdaptor如下注入到Demo即可。
        Demo d2 = new Demo(new BAdaptor(new B()));
    }
}
