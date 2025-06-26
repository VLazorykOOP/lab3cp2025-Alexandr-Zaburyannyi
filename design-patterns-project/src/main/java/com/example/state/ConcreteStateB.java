package com.example.state;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in ConcreteStateB");
        context.setState(new ConcreteStateA());
    }
}