package java8interfaces;

public interface Intefaces {
  default void doSomething(){
        System.out.println("Return this as implementation");
    }

    static void returnSomething() {
        System.out.println("This is just returned from the static method, accessed by interfaceName.the method");
    }


}
