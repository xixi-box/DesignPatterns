package com.ws.behavioral.strategy.use;

import com.ws.behavioral.templateMethod.callback.use1.User;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 15:57
 * @Version 1.0
 * @Description 策略接口：EvictionStrategy
 * 策略类：LruEvictionStrategy、FifoEvictionStrategy、LfuEvictionStrategy...
 * 策略工厂：EvictionStrategyFactory
 */
public class UserCache {
    private Map<String, User> cacheData = new HashMap<>();
    private EvictionStrategy eviction;

    public UserCache(EvictionStrategy eviction) {
        this.eviction = eviction;
    }
    //...
}

