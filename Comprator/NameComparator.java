package Comprator;

import List.Department;
import List.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Hagos", 1232312.22, "Computer Science", new Department());
        Employee employee2 = new Employee("Berhe", 2232312.22, "Computer Science", new Department());

        NameComparator nameComparator = new NameComparator();

        System.out.println("Output ");
        System.out.println(nameComparator.compare(employee1, employee2));



    }
}
