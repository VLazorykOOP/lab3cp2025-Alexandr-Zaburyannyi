# Design Patterns Project

This project demonstrates the implementation of various design patterns in Java. The following design patterns are included:

## Design Patterns Implemented

1. **Singleton Pattern**: 
   - Ensures that a class has only one instance and provides a global point of access to it.
   - Implemented in `src/main/java/com/example/singleton/Singleton.java`.

2. **Decorator Pattern**: 
   - Allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.
   - Components are defined in `src/main/java/com/example/decorator/Component.java`, with concrete implementations in `ConcreteComponent.java` and additional functionalities in `ConcreteDecorator.java`.

3. **State Pattern**: 
   - Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
   - The state interface is defined in `src/main/java/com/example/state/State.java`, with concrete states implemented in `ConcreteStateA.java` and `ConcreteStateB.java`. The context managing the states is in `Context.java`.

## How to Run the Project

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory.
4. Compile the Java files using the command:
   ```
   javac src/main/java/com/example/*.java src/main/java/com/example/singleton/*.java src/main/java/com/example/decorator/*.java src/main/java/com/example/state/*.java
   ```
5. Run the application using the command:
   ```
   java com.example.Main
   ```

## Examples of Usage

- The `Main.java` file serves as the entry point and demonstrates how to use the implemented design patterns. You can modify this file to test different scenarios and behaviors of the patterns.

Feel free to explore the code and modify it to better understand the design patterns in action!