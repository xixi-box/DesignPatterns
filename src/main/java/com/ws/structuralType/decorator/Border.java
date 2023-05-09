package com.ws.structuralType.decorator;

/**
 * @Author: 王顺
 * @Date: 2023/5/9 16:25
 * @Version 1.0
 */
public abstract class Border extends Display {
    protected Display display;//表示被装饰物

    protected Border(Display display) {//在生成实例时通过参数指定被装饰物
        this.display = display;
    }
}
