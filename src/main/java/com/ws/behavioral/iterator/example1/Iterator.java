package com.ws.behavioral.iterator.example1;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 16:23
 * @Version 1.0
 */
public interface Iterator<E> {
    boolean hasNext();

    void next();

    E currentItem();
}
