package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    // a method that returns List
    // the output is computed using streams

    // Find the list of strings that contains the specific letter

    List<String> returnString(List<String> list, String letter) {
        return list.stream().filter(x->x.contains(letter)).collect(Collectors.toList());

        // startsWith
        // limit - limiting the specific results
        // range - to find in specific range
        // map - for affecting each element
    }

    public static void main(String[] args) {
        /*
        Ways to create a stream
        - From arrays
         */
        Integer[] ints = {2,4,4,5,5,6,6};
        Stream<Integer> stream = Stream.of(ints);

        // or create Stream of Strings
        Stream<String> singers = Stream.of("Emenium", "Weyne", "Kanye");

        // Using generate
        Stream<Double> echo = Stream.generate(Math::random);

    }
}
