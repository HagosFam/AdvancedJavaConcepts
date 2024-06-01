package problemSolving;

public class ReverseString {
    public static String reverseString(String string) {
        StringBuilder reversedString = new StringBuilder();
        for (int i=string.length()-1; i>=0; i--) {
            reversedString.append(string.charAt(i));
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String original = "Hello";
        System.out.println("Original String " + original );

        System.out.println("Reversed String " + reverseString(original));
    }
}
