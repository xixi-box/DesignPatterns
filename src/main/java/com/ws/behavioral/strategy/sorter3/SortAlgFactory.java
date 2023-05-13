package com.ws.behavioral.strategy.sorter3;

import com.ws.behavioral.strategy.sorter2.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 16:50
 * @Version 1.0
 */
public class SortAlgFactory {
    private static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}