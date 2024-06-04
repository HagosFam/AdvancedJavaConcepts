package java8interfaces;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ma implements Intefaces {
    public static void main(String[] args) {
        Intefaces.returnSomething();

        List<Integer> integerList = Collections.emptyList();
        integerList.add(3);

        // What are the four ways to itrate through a list
        // for loop
        for (int i = 0; i < integerList.size(); i++) {

        }

        // for in
        for (Integer k : integerList) {

        }

        // for each
        integerList.forEach(x -> System.out.println(x));


    }
}
