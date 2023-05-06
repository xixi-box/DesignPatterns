package com.ws.creationType.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class LazyManIdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static LazyManIdGenerator instance;

    private LazyManIdGenerator() {
    }

    private static synchronized LazyManIdGenerator getInstance() {
        if (instance == null) {
            instance = new LazyManIdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
