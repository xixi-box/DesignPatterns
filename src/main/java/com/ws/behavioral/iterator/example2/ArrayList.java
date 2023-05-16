package com.ws.behavioral.iterator.example2;


/**
 * @Author: 王顺
 * @Date: 2023/5/15 16:31
 * @Version 1.0
 */
public class ArrayList<E> implements List<E> {


    public int modCount;

    //...
    public Iterator iterator() {

        return new ArrayIterator(this);
    }

    /**
     * @return
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @param cursor
     * @param <E1>
     * @return
     */
    @Override
    public <E1> E1 get(int cursor) {
        return null;
    }

    /**
     * @param e
     */
    @Override
    public void add(E e) {
    }
    //...省略其他代码
}
