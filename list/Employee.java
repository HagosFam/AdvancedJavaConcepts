package list;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private String major;

    private Department department;

    public Employee() {}
    public Employee(String name, double salary, String major, Department department) {
        this.name = name;
        this.salary = salary;
        this.major = major;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getMajor() {
        return major;
    }

    public Department getDepartment() {
        return department;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Double.compare(getSalary(), employee.getSalary()) == 0 && Objects.equals(getName(), employee.getName()) && Objects.equals(getMajor(), employee.getMajor()) && Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getMajor(), getDepartment());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", major='" + major + '\'' +
                ", department=" + department +
                '}';
    }


}
