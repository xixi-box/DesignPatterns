package com.ws.behavioral.strategy.use2;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 16:11
 * @Version 1.0
 */
public class PromotionDiscountStrategy implements DiscountStrategy {
    /**
     * @param order
     * @return
     */
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
