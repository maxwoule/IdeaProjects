import java.util.*;
public class Department {
    String name;
    Employee head;
    Set<Employee> employees;

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.employees = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
