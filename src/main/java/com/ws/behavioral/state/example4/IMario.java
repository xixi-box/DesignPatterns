package com.ws.behavioral.state.example4;

import com.ws.behavioral.state.example2.State;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 15:52
 * @Version 1.0
 */
public interface IMario {
    State getName();
    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}
