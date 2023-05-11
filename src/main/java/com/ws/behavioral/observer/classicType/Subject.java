package com.ws.behavioral.observer.classicType;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 16:46
 * @Version 1.0
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
