package com.ws.behavioral.observer.GuavaEventBus;

import java.util.concurrent.ExecutorService;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 15:35
 * @Version 1.0
 * @Description 异步阻塞
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(ExecutorService executorService) {
        super(executorService);
    }
}
