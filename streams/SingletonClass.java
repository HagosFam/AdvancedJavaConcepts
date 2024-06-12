package streams;

public class SingletonClass {
    private static SingletonClass singletonClass= new SingletonClass();
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if(singletonClass==null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println(singletonClass1);
    }





}
