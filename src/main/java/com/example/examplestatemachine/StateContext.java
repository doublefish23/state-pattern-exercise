package com.example.examplestatemachine;

public class StateContext {
    State acceptState ;
    State rejectState ;
    State currentState;
    int FirstA = 0; // 0 -> null, -1 -> false, 1 -> true;

    public StateContext () {
        this.rejectState = new StateChild(this, false);
        this.acceptState = new StateChild(this, true);
        currentState = rejectState ;
    }
    public void actionA() {
        currentState.actionA();
    }
    public void actionB() {
        currentState.actionB();
    }

    public boolean isAccept() {
        return currentState.isAccept();
    }

    public void setState(State s) {
        this.currentState = s;
    }
    public void setFirstA(int b)
    {
        this.FirstA = b;
    }
    public int getFirstA()
    {
        return FirstA;
    }
    public State getAcceptState() {
        return this.acceptState;
    }

    public State getRejectState() {
        return this.rejectState;
    }
}
