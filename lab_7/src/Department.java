import java.util.List;
import java.util.ArrayList;

public class Department {
    String name;
    Employee head;
    List<Employee> employees;

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
