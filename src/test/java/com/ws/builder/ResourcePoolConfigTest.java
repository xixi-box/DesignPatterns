package com.ws.builder;

import com.ws.creationType.builder.ResourcePoolConfig;
import org.junit.Test;

/**
 * @Author: 王顺
 * @Date: 2023/5/5 16:39
 * @Version 1.0
 */
public class ResourcePoolConfigTest {
    @Test
    public void test() {
// 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}