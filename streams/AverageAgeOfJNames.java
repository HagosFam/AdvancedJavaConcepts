package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
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

        OptionalDouble iinte = people.stream().filter(name->name.getName().startsWith("J")).mapToInt(Person::getAge).average();

        return 0;
    }









}
