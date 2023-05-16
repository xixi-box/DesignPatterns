package com.ws.behavioral.iterator.example2;


/**
 * @Author: 王顺
 * @Date: 2023/5/15 16:30
 * @Version 1.0
 */
public interface List<E> {
    Iterator iterator();

    int size();

    <E> E get(int cursor);

    void add(E xzg);
    //...省略其他接口函数...
}
