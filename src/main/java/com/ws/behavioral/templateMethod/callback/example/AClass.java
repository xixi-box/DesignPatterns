package com.ws.behavioral.templateMethod.callback.example;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 17:17
 * @Version 1.0
 * @Description A类事先注册某个函数 F 到 B类，A 类在调用 B 类的 P 函数的时候，B 类反过来调用 A 类注册给它的 F 函数。这里的 F
 * 函数就是“回调函数”。A 调用 B，B 反过来又调用 A，这种调用机制就叫作“回调”。
 */
public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        /**
         *P函数
         */
        b.process(new ICallback() { //回调对象
            /**
             *F函数
             */
            @Override
            public void methodToCallback() {
                System.out.println("Call back me.");
            }
        });
    }
}
