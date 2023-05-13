package com.ws.behavioral.strategy.use2;

import java.util.HashMap;
import java.util.Map;

// 省略NormalDiscountStrategy、GrouponDiscountStrategy、PromotionDiscountStrategy
// 策略的创建
public class DiscountStrategyFactory {
    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType type) {
        return strategies.get(type);
    }
}
