package com.ws.behavioral.strategy.use;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 16:03
 * @Version 1.0
 */
public class EvictionStrategyFactory {
    public static EvictionStrategy getEvictionStrategy(String type) {
        return new EvictionStrategy();
    }
}
