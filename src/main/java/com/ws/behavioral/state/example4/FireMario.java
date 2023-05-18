package com.ws.behavioral.state.example4;

import com.ws.behavioral.state.example2.State;


public class FireMario implements IMario {
    private static final FireMario instance = new FireMario();

    private FireMario() {
    }

    public static FireMario getInstance() {
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
