package java8interfaces;

@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod(String s);

    // we cant add another method here,
    // functional interfaces are interfaces with one abstract method

}
