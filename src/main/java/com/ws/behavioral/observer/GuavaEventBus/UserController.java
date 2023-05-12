package com.ws.behavioral.observer.GuavaEventBus;

import com.ws.behavioral.observer.p2p.first.UserService;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 15:29
 * @Version 1.0
 */
public class UserController {
    private UserService userService; // 依赖注入
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        //eventBus = new EventBus(); // 同步阻塞模式
        //异步阻塞模式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        eventBus.post(userId);
        return userId;
    }
}

