package com.ws.behavioral.strategy.example2;

import com.ws.behavioral.strategy.example1.ConcreteStrategyA;
import com.ws.behavioral.strategy.example1.ConcreteStrategyB;
import com.ws.behavioral.strategy.example1.Strategy;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 15:55
 * @Version 1.0
 */
public class StrategyFactory2 {
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        if (type.equals("A")) {
            return new ConcreteStrategyA();
        } else if (type.equals("B")) {
            return new ConcreteStrategyB();
        }
        return null;
    }
}
