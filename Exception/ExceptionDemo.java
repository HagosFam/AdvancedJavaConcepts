package Exception;

public class ExceptionDemo {
    public static int methodName() throws ArithmeticException {
        int x = 0;
        int c = 0;
        int y = 10;
        try {
            c= y/x;
            System.out.println("Result " + c);
        } catch (Exception exception) {
            System.out.println("Division by 0" + exception);
        }
        finally {
            System.out.println("This will be executed unless there is system.exit(0) ");
        }
       // System.exit(0);
        return c;
    }

    public static void main(String[] args) {

        System.out.println(ExceptionDemo.methodName());
    }
}
