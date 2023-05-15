package com.ws.behavioral.State.example4;

import com.ws.behavioral.State.example2.State;


public class SuperMario implements IMario {
    private static final SuperMario instance = new SuperMario();

    private SuperMario() {
    }

    public static SuperMario getInstance() {
        return instance;
    }


    /**
     * @return
     */
    @Override
    public State getName() {
        return null;
    }

    /**
     * @param stateMachine
     */
    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {

    }

    /**
     * @param stateMachine
     */
    @Override
    public void obtainCape(MarioStateMachine stateMachine) {

    }

    /**
     * @param stateMachine
     */
    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {

    }

    /**
     * @param stateMachine
     */
    @Override
    public void meetMonster(MarioStateMachine stateMachine) {

    }
}
