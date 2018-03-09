package com.example.examplestatemachine;

public class StateChild extends State {

    public StateChild(StateContext sc, Boolean isAccept) {
        this.sc = sc;
        this.accept = isAccept;
    }


    @Override
    public void actionA() {
        if (sc.getFirstA() == 0) {
            sc.setFirstA(1);
        }

        if (sc.getFirstA() == 1) {
            sc.setState(sc.getAcceptState());
        }

        if (sc.getFirstA() == -1) {
            sc.setState(sc.getRejectState());
        }
    }

    @Override
    public void actionB() {
        if (sc.getFirstA() == 0) {
            sc.setFirstA(-1);
        }

        if (sc.getFirstA() == 1) {
            sc.setState(sc.getRejectState());
        }

        if (sc.getFirstA() == -1) {
            sc.setState(sc.getAcceptState());
        }
    }
}
