package List;

import generics.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Mai {
    public static void main(String[] args) {

        // Ways to create a list, others are obvious, but the Arrays.asList, List.of (for fixed inputs),

        // list the employees that their location starts with S
        int[] ints = {2,3,4,5,5};
        List<Integer> integerList = Arrays.asList(3,4,5,6);

        Department department = new Department();
        department.setDepartmentName("Computer");
        department.setDepartmentCode("CS123");
        department.setLocation("Smart");

        Employee employee = new Employee();
        employee.setDepartment(department);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);

        // ways to create a list

        List<Integer> integerListt = Arrays.asList(1,2,3,3);

        List<Employee> employeesList = List.of(new Employee(), new Employee() ); // or the created employees

        List<String> strings = new CopyOnWriteArrayList<>(); // thread safe variant of array list

        List<Employee> employeeList = new ArrayList<>(); // LinkedList, SingltonList, Vector, Stream of collectors,

        List<Employee> employees1 = employees.stream().filter(x -> x.getDepartment().getLocation().startsWith("S")).collect(Collectors.toList());

        // let's use static, I like static things, as I don't have to create object to access any of the variables

        for(Employee e:employees1) {
            System.out.println("Location " + e.getDepartment().getLocation());
        }




        // This is how we demo an enum
        Size size = Size.Large;  // this is when we need the ENUM

        String sizeInString = Size.Medium.name(); // This is when we need a size in string




    }
}
