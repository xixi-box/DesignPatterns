package com.ws.behavioral.observer.GuavaEventBus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 15:34
 * @Version 1.0
 */
public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
        this(MoreExecutors.directExecutor());
    }

    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    /**
     * @param observer
     * @target EventBus 类提供了 register() 函数用来注册观察者。具体的函数定义如下所示。它可以接
     * 受任何类型（Object）的观察者。而在经典的观察者模式的实现中，register() 函数必须接受实现了同一 Observer 接口的类对象。
     */
    public void register(Object observer) {
        registry.register(observer);
    }

    public void unregister(Object object) {

    }

    /**
     * @param
     * @target 用来给观察者发送消息
     */
    public void post(Object event) {
        List<ObserverAction> observerActions = new ArrayList<>(registry.getMatchedObserverActions(event));
        for (ObserverAction observerAction : observerActions) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }
}
