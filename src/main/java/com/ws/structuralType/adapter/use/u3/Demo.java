package com.ws.structuralType.adapter.use.u3;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 15:22
 * @Version 1.0
 * @Description 当我们把项目中依赖的一个外部系统替换为另一个外部系统的时候，利用适配器模式，可以
 * 减少对代码的改动。具体的代码示例如下所示：
 */
// 在我们的项目中，外部系统A的使用示例
public class Demo {
    private IA a;

    public Demo(IA a) {
        this.a = a;
    }
//...
}