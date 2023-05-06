package com.ws.structuralType.proxy;

import org.junit.Test;

/**
 * @Author: 王顺
 * @Date: 2023/5/6 16:55
 * @Version 1.0
 */
public class MetricsCollectorProxyTest {
    @Test
    public void testMetricsCollector() {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());

    }
}