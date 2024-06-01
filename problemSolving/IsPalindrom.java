package problemSolving;

public class IsPalindrom {

    public static boolean isPalindrom(String string) {
        int len = string.length() -1;
        for(int i=0; i<len; i++) {
            if(string.charAt(i)!=string.charAt(len-1)) {
                return false;
            }
            len--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "abckcba";
        System.out.println(IsPalindrom.isPalindrom(string));
    }

}
