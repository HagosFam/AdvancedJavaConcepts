package exception;

public class Simple {

    public String handleException() throws ArithmeticException {
        try {
            int x = 5;
            int y = x/0;
        }
        catch (Exception e) {
            System.out.println("Exception thrown " + e);
        }
        finally {
            System.out.println("This runs regardless");
        }

        return "Handled";
    }

    public static void main(String[] args) throws Exception {
        Simple simple = new Simple();
        simple.handleException();
    }
}
