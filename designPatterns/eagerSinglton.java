package designPatterns;

public class eagerSinglton {
    /// creating only a single instance of a class and giving a global access to the class. thread safety is not guaranteed


    // to create a singlton class, we need a static member, private constructor and static factory method.


    // the static variable makes us to access the variable globally.
    private static final eagerSinglton EAGER_SINGLTON = new eagerSinglton();

    // this private constructor makes creating objects impossible
    private eagerSinglton() {

    }

    public static void main(String[] args) {
        eagerSinglton eagerSinglton1 = eagerSinglton.EAGER_SINGLTON;
        System.out.println(eagerSinglton1.doSomething());

        // System.out.println(Singlton.singlton);
    }

    // then do this.
    public String doSomething() {

        return "Return something";
    }

    @Override
    public String toString() {
        return "Singlton{}";
    }


}
