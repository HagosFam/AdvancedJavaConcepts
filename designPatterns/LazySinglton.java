package designPatterns;

import java.security.PublicKey;

public class LazySinglton {
    private static LazySinglton lazySinglton;

    private LazySinglton() {
    }

    public static LazySinglton getLazySinglton() {
        if(lazySinglton==null) {
            lazySinglton = new LazySinglton();

        }
        return lazySinglton;
    }

    public String showMessage() {
        return "This is sample message";
    }

    public static void main(String[] args) {
        LazySinglton lazySinglton1 = LazySinglton.getLazySinglton();
        System.out.println( lazySinglton1.showMessage());
    }

}
