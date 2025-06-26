package com.example.decorator;

public class ConcreteDecorator extends Decorator {
    private String addedState;

    public ConcreteDecorator(Component component) {
        super(component);
        this.addedState = "Extra Decoration";
    }

    @Override
    public String operation() {
        return super.operation() + " + " + addedState;
    }
}