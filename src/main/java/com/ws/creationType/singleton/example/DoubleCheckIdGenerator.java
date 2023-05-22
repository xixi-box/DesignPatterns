package com.ws.creationType.singleton.example;

import java.util.concurrent.atomic.AtomicLong;

public class DoubleCheckIdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static DoubleCheckIdGenerator instance;

    private DoubleCheckIdGenerator() {
    }

    public static DoubleCheckIdGenerator getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckIdGenerator.class) {//加入类级别的锁
                if (instance == null) {
                    instance = new DoubleCheckIdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
