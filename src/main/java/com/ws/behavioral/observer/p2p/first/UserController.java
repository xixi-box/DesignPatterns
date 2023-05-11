package com.ws.behavioral.observer.p2p.first;

import com.ws.behavioral.observer.p2p.last.PromotionService;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 16:57
 * @Version 1.0
 */
public class UserController {
    private UserService userService; // 依赖注入
    private PromotionService promotionService; // 依赖注入

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
