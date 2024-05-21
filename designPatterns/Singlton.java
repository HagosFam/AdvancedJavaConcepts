package designPatterns;

public class Singlton {
    /// creating only a single instance of a class and giving a global access to the class. thread safety is not guaranteed


    // to create a singlton class, we need a static member, private constructor and static factory method.


    // the static variable makes us to access the variable globally.
    private static final Singlton singlton = new Singlton();

    // this private constructor makes creating objects impossible
    private Singlton(){

    }

    private Singlton getSinglton() {
        return singlton;
    }


    // then do this.
    public void doSomething() {

    }

    @Override
    public String toString() {
        return "Singlton{}";
    }

    public static void main(String[] args) {
        System.out.println("Lets see what will be printed here");
        System.out.println(Singlton.singlton);
    }






}
