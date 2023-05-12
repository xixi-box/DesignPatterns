package com.ws.behavioral.observer.GuavaEventBus;

import org.apache.poi.util.Beta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: 王顺
 * @Date: 2023/5/12 15:34
 * @Version 1.0
 * @Description用于标明观察者中的哪个函数可以接收消息。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Beta
public @interface Subscribe {
}