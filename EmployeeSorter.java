import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + age + ", $" + salary + ")";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 70000),
            new Employee("Bob", 25, 50000),
            new Employee("Charlie", 35, 80000),
            new Employee("David", 40, 65000)
        );

        // Sorting by name
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by name: " + employees);

        // Sorting by age
        employees.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age: " + employees);

        // Sorting by salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Sorted by salary (descending): " + employees);
    }
}
