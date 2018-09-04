# java-experiments

## Java 10


## Java 9
### Modules
https://www.baeldung.com/java-9-modularity
<br>
A Module is a group of closely related packages and resources along with a new module descriptor file. 
In other words, it’s a “package of Java Packages” abstraction that allows us to make our code even more reusable.
<br>`java --list-modules` lists the default java modules.


## Java 8
### Lambdas
https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html<br>

Lambda expressions are anonymous methods (methods without names) used to implement a method defined by a functional interface.
A functional interface (java.util.function) is an interface that contains one and only one abstract method.

### Default Methods
Java 8 introduces “Default Method” or (Defender methods) new feature, which allows developer to add new methods to the interfaces without breaking the existing implementation of these interfaces. 


#### Abstract classes versus interfaces in Java 8
After introducing Default Method, it seems that interfaces and abstract classes are same. However, they are still a different concept in Java 8.

Abstract class can define constructor. They are more structured and can have a state associated with them. While in contrast, default method can be implemented only in the terms of invoking other interface methods, with no reference to a particular implementation's state. 
Hence, both are used for different purposes and choosing between two really depends on the scenario context.