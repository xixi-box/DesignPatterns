package com.ws.creationType.singleton.example;

import java.util.concurrent.atomic.AtomicLong;

public class StaticInnerClassIdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private StaticInnerClassIdGenerator() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClassIdGenerator instance = new StaticInnerClassIdGenerator();
    }

    public static StaticInnerClassIdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
