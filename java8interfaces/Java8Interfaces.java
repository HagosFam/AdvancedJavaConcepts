package java8interfaces;

public interface Java8Interfaces {
    // after java 8, two kinds of implemented methods are added to interfaces
     // the default and the static methods

    default void myMethod() {
        // this is used to provide common implementation to the classes that implement it
        // this is used to provide common service to all the classes
    }

    static void myStaticMethod() {
        // The static one is to use it like utility class
    }
}
