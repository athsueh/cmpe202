# CMPE202 Lab 9
Alan Hsueh

This is my submission for lab 9. The design pattern I implemented in functional format for this lab was the "decorator."

Major differences in the implementation for the decorator can be easily seen by this line in the original Tester/main file.

```
Component obj = new ConcreteDecoratorB( new ConcreteDecoratorA( new ConcreteComponent() ) ) ;
```
The original object oriented approach chose to wrap a component object with two decorator objects. These Concrete Decorator objects would take in a Component parameter and return a Component. Consequently, operation() could be called on the resulting object.

Another large change is that for the functional approach, there is a lack of Concrete Decorator classes. (ConcreteDecoratorA, ConcreteDecoratorB) Moreover, the resulting decorated object can be called the following way.

```
Component obj = Decorator.Decorate(new ConcreteComponent(), Decorator::A, Decorator::B);
```
In this approach, the Decorator class method Decorate would take in a component and a list of desired Decorator functions. (e.g. Decorator::A,Decorator::B) Thus, multiple decorators (and repeat decorators) can be called in a sequential order. The Decorate method can take in a list of desired functions, which in turn is parsed with the Java Stream function. The functions are then applied in order using "Function::andThen." This promotes composition, as functions are passed into the parent Decorate function, as opposed to the object oriented approach of multiple wrapped object methods.
