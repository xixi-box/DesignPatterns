package com.ws.behavioral.State.example3;

import com.ws.behavioral.State.example2.State;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 15:32
 * @Version 1.0
 */
public interface IMario { //所有状态类的接口
    State getName();
    //以下是定义的事件
    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();
}
