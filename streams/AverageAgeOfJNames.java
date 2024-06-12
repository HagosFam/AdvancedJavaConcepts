package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AverageAgeOfJNames {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Jane", 30),
                new Person("Jim", 35),
                new Person("Alice", 28),
                new Person("Bob", 22)
        );
        double averageAge = calculateAverageAgeOfJNames(people);
        System.out.println("Average age of people with names starting with 'J': " + averageAge);
    }

    public static double calculateAverageAgeOfJNames(List<Person> people) {
        return 0;
    }

    List<String> strings = Arrays.asList("Nigus", "Abraha", "Hagos");

    String[] strArray = strings.stream().toArray(String[]::new);  // this is how to list into array

    // how to change array into list

    Integer[] ints = {4,6,7,8,9,6};

    List<Integer> intList = Arrays.asList(ints); // i changed this array into list and now i can apply stream operations here.











}
