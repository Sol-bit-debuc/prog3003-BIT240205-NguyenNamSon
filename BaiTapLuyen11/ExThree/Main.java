package ExThree;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "1a", 1200),
                new Employee(2, "2a", 800),
                new Employee(3, "3a", 1500),
                new Employee(4, "4a", 1100)
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000)
                .map(Employee::getName) 
                .sorted() 
                .collect(Collectors.toList());   
        System.out.println("Nvien luong > 1000: " + result);
    }
}
