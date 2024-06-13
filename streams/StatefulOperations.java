package streams;

import java.sql.SQLSyntaxErrorException;
import java.util.Comparator;
import java.util.stream.Stream;

public class StatefulOperations {
    public static void main(String[] args) {
        // map, filter, limit, skip, concat = are stateless - each element is processed and forgetten

        //Two stateful operations

        // distinct - gives us unique, non-repeated elements
          // sorted - this one sorts a list naturally.

        Stream<String> stream = Stream.of("Hagos", "Hadash", "Hadash", "Bazen");

        Stream<String> uniqueNames = stream.distinct();
        System.out.println("Printing unique names");
        uniqueNames.forEach(System.out::print);

        // lets sort this stream with string length

        // it sorts and reverses the string
        Stream<String> sortedStream = stream.sorted(Comparator.comparing(String::length).reversed());
        

    }

}
