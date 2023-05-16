package com.ws.behavioral.iterator.example1;


import java.util.NoSuchElementException;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 16:23
 * @Version 1.0
 */
public class ArrayIterator<E> implements Iterator<E> {
    //游标
    private int cursor;
    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size(); //注意这里，cursor在指向最后一个元素的时候，hasNest返回为false
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}

