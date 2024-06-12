package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubStream {
    public static void main(String[] args) {
        // stream operations that help us to create a sub stream
        List<Integer> integers = Arrays.asList(3, 5, 6, 4, 5, 64, 6, 7, 7, 7, 7, 745, 45);

        // limit
        // Here, we are acting on the sub stream
        List<Integer> limit = integers.stream().filter(x -> x < 10).limit(3).collect(Collectors.toList());
        System.out.println("Limit");
        limit.forEach(System.out::print);

        // skip
        // it skips evaluation of given members
        List<Integer> skip = integers.stream().filter(x -> x < 10).skip(5).collect(Collectors.toList());
        System.out.println("Skip");
        skip.forEach(System.out::print);

        // concat
        // used to concat two streams
        // Lets concatnate the skip and limit streams
        Stream<Integer> concat = Stream.concat(integers.stream().filter(x -> x < 10).limit(3),
                integers.stream().filter(x -> x < 10).skip(5));

        System.out.println("Concat output");
        concat.forEach(System.out::print);

        List<Integer> loop = integers.stream().filter((x) -> {
            int y = x;
            while (y > 0) {
                y--;
            }
            return x % 2 == 0;
        }).collect(Collectors.toList());
    }


    String[] strings = {"amaz", "am", "amazing", "amazon"};

    String str = Arrays.stream(strings).reduce((str1, str2)->{
        String common = "";
        return common;
    }).orElse("");

    // if we are returning one output from a stream, we should use reduce
    // if we are returning something and have a possiblity of being empty, we should use orElse at last
    // Math.min

}
