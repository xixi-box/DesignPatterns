package com.ws.behavioral.iterator.example2;


import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 17:08
 * @Version 1.0
 */
public class ArrayIterator implements Iterator {
    private int cursor;
    private ArrayList arrayList;
    private int expectedModCount;

    public ArrayIterator(ArrayList arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
        this.expectedModCount = arrayList.modCount;
    }

    @Override
    public boolean hasNext() {
        checkForComodification();
        return cursor < arrayList.size();
    }

    @Override
    public void next() {
        checkForComodification();
        cursor++;
    }

    @Override
    public Object currentItem() {
        if (cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }

    private void checkForComodification() {
        if (arrayList.modCount != expectedModCount)
            throw new ConcurrentModificationException();
    }
}