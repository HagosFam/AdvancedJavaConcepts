package questions;
public class ReverseString {
    public static String reverseString(String input) {
       return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("madam"));
    }

}
