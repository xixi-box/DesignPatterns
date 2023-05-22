package com.ws.creationType.singleton.example;

import java.util.concurrent.atomic.AtomicLong;

public class HungryManIdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final HungryManIdGenerator instance = new HungryManIdGenerator();

    private HungryManIdGenerator() {
    }

    public static HungryManIdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
