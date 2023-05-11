package com.ws.behavioral.observer.classicType;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 16:47
 * @Version 1.0
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * @param message
     * @target 通知观察者
     */
    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
