package com.ws.behavioral.strategy.example2;

import com.ws.behavioral.strategy.example1.ConcreteStrategyA;
import com.ws.behavioral.strategy.example1.ConcreteStrategyB;
import com.ws.behavioral.strategy.example1.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 15:52
 * @Version 1.0
 */
public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
