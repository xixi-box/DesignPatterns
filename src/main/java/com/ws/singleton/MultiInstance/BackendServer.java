package com.ws.singleton.MultiInstance;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author: 王顺
 * @Date: 2023/4/26 16:53
 * @Version 1.0
 */
public class BackendServer {

    private long serverNo;
    private String serverAddress;
    private static final int SERVER_COUNT = 3;
    private static final Map<Long, BackendServer> serverInstances = new HashMap<>();

    static {
        serverInstances.put(1L, new BackendServer(1L, "192.134.22.138:8080"));
        serverInstances.put(2L, new BackendServer(2L, "192.134.22.139:8080"));
        serverInstances.put(3L, new BackendServer(3L, "192.134.22.140:8080"));
    }

    public BackendServer(long serverNo, String serverAddress) {
        this.serverNo = serverNo;
        this.serverAddress = serverAddress;
    }

    /**
     * @param serverNo
     * @return 返回指定的实例
     */
    public BackendServer getInstance(long serverNo) {
        return serverInstances.get(serverNo);
    }

    /**
     * @return 返回随机实例
     */
    public BackendServer getRandomInstance() {
        Random r = new Random();
        int no = r.nextInt(SERVER_COUNT) + 1;
        return serverInstances.get(no);
    }
}
