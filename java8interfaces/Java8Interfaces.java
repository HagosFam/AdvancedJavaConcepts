package java8interfaces;

public interface Java8Interfaces {
    // after java 8, two kinds of implemented methods are added to interfaces
     // the default and the static methods

    default void myMethod() {
        // this is used to provide common implementation to the classes that implement it
    }

    static void myStaticMethod() {
        // To just directly use
    }
}
