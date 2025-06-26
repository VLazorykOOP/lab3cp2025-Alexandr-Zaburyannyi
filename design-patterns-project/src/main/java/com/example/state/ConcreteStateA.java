package com.example.state;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in ConcreteStateA");
        context.setState(new ConcreteStateB());
    }
}