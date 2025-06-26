package com.example;

import com.example.singleton.Singleton;
import com.example.decorator.Component;
import com.example.decorator.ConcreteComponent;
import com.example.decorator.Decorator;
import com.example.decorator.ConcreteDecorator;
import com.example.state.Context;
import com.example.state.ConcreteStateA;
import com.example.state.ConcreteStateB;

public class Main {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        System.out.println("Singleton instance: " + singletonInstance);

        Component component = new ConcreteComponent();
        System.out.println("Basic Component: " + component.operation());

        Decorator decoratedComponent = new ConcreteDecorator(component);
        System.out.println("Decorated Component: " + decoratedComponent.operation());

        Context context = new Context(new ConcreteStateA());
        context.request();

        context.setState(new ConcreteStateB());
        context.request();
    }
}