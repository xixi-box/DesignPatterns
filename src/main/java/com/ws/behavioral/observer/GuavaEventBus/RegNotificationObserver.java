package com.ws.behavioral.observer.GuavaEventBus;

import com.ws.behavioral.observer.p2p.last.NotificationService;

public class RegNotificationObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}
