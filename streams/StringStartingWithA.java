package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringStartingWithA {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apricot", "cherry", "avocado");
        List<String> result = filterStringsStartingWithA(strings);
        System.out.println(result);
    }

    public static List<String> filterStringsStartingWithA(List<String> strings) {
        List<String> startingWithA = strings.stream().filter(str->str.startsWith("a") || str.startsWith("A") ).collect(Collectors.toList());
        return startingWithA;
    }
}
