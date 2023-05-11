package com.ws.behavioral.observer.p2p.last;

import com.ws.behavioral.observer.p2p.first.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 17:07
 * @Version 1.0
 */
public class UserController {
    private UserService userService; // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();

    // 一次性设置好，之后也不可能动态的修改
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        //注册后生成ID
        long userId = userService.register(telephone, password);
        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
