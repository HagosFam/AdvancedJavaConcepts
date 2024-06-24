package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Itrator {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList();

        List<String> strings1 = List.of("One", "Two");

        List<String> strings = Collections.emptyList(); // now you can add to this list.

        Iterator<Integer> iterator = integers.iterator();

        // itrable - itrator - list - arraylist/linkedlist ( arrayslist - form randomAccess interface, linkedlist - abstractsequeintiallist

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // sorting elements using collections
        Collections.sort(integers); // it sorts naturally, by number or alphabet


        // use this thing for future coding practices in the field of software engineering
        // i am peoples person,


    }
}
