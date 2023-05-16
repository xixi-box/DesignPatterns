package com.ws.behavioral.iterator.example3;

/**
 * @Author: 王顺
 * @Date: 2023/5/16 17:12
 * @Version 1.0
 */
public interface List <E>{
    void add(E obj);
    void remove(E obj);
    Iterator<E> iterator();

}
