package com.ws.creationType.singleton.Distributed;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: 王顺
 * @Date: 2023/4/26 16:23
 * @Version 1.0
 */
class test {

    public void test1() {
        // IdGenerator使用举例
        ClusterUniqueIdGenerator idGeneator = ClusterUniqueIdGenerator.getInstance();
        long id = idGeneator.getId();
        idGeneator.freeInstance();
    }
}

public class ClusterUniqueIdGenerator {
    private AtomicLong id = new AtomicLong();
    private static ClusterUniqueIdGenerator instance;
    private static SharedObjectStorage storage = new SharedObjectStorage();
    private static DistributedLock lock = new DistributedLock();

    public ClusterUniqueIdGenerator() {
    }

    public synchronized static ClusterUniqueIdGenerator getInstance() {
        if (instance == null) {
            lock.lock();
            Object load = storage.load(ClusterUniqueIdGenerator.class);


        }
        return instance;
    }

    public synchronized void freeInstance() {
        storage.save(this, ClusterUniqueIdGenerator.class);
        instance = null;//释放对象
        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }
}

class SharedObjectStorage {
    public Object load(Class<?> key) {
        return new Object();
    }

    public void save(Object object, Class<?> clazz) {

    }
}
;

class DistributedLock {
    public void lock() {

    }

    public void unlock() {
    }
}

