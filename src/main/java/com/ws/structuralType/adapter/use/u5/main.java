package com.ws.structuralType.adapter.use.u5;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 16:07
 * @Version 1.0
 * 适配器模式主要用于接口的适配，实际上，它还可以用在不同格式的数据之
 * 间的适配。比如，把从不同征信系统拉取的不同格式的征信数据，统一为相同的格式，以方
 * 便存储和使用。再比如，Java 中的 Arrays.asList() 也可以看作一种数据适配器，将数组类
 * 型的数据转化为集合容器类型。
 */
public class main {
    public static void main(String[] args) {
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
    }
}
