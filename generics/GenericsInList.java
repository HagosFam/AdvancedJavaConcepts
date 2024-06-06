package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInList {
    public static void main(String[] args) {
        // Lists work based on Generics
        // It was originally List list = new ArrayList - in this case we should cast it


        // The latest List Generics
        List<String> stringList = new ArrayList<>(); // we made it to hold strings

        List<Integer> integers = new ArrayList<>(); // we made it to hold integers
    }
}
