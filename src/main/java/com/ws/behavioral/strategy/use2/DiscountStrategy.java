package com.ws.behavioral.strategy.use2;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 16:06
 * @Version 1.0
 */
// 策略的定义
public interface DiscountStrategy {
    double calDiscount(Order order);
}

