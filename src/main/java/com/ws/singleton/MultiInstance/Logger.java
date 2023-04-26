package com.ws.singleton.MultiInstance;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 王顺
 * @Date: 2023/4/26 16:57
 * @Version 1.0
 */
public class Logger {
    private static final ConcurrentHashMap<String, Logger> instances
            = new ConcurrentHashMap<>();

    private Logger() {
    }

    public static Logger getInstance(String loggerName) {
        instances.putIfAbsent(loggerName, new Logger());
        return instances.get(loggerName);
    }

    public void log() {
        //...
    }
}

class test {
    void test1() {
        Logger l1 = Logger.getInstance("User.class");
        Logger l2 = Logger.getInstance("User.class");
        Logger l3 = Logger.getInstance("Order.class");
    }

}