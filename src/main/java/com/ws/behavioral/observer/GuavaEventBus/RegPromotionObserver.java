package com.ws.behavioral.observer.GuavaEventBus;

import com.ws.behavioral.observer.p2p.last.PromotionService;

public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
