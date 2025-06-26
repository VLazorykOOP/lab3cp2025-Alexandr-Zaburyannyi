package com.example.state;

public class Context {
    private State currentState;

    public Context(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public void request() {
        currentState.handle(this);
    }
}