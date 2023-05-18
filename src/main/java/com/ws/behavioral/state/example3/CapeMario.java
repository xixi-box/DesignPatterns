package com.ws.behavioral.state.example3;

import com.ws.behavioral.state.example2.State;

public class CapeMario implements IMario {

    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    /**
     * @return
     */
    @Override
    public State getName() {
        return null;
    }

    /**
     *
     */
    @Override
    public void obtainMushRoom() {

    }

    /**
     *
     */
    @Override
    public void obtainCape() {

    }

    /**
     *
     */
    @Override
    public void obtainFireFlower() {

    }

    /**
     *
     */
    @Override
    public void meetMonster() {

    }
}
