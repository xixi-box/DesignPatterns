package com.ws.singleton.Distributed;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 创建一个线程唯一的单例模式
 */
public class ThreadUniqueIdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final ConcurrentHashMap<Long, ThreadUniqueIdGenerator> instances
            = new ConcurrentHashMap<>();

    public ThreadUniqueIdGenerator() {
    }

    public static ThreadUniqueIdGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new ThreadUniqueIdGenerator());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
