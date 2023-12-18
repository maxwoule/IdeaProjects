import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Company {
    String name;
    Employee director;
    List<Department> departments;

    public Company(String name, Employee director) {
        this.name = name;
        this.director = director;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Завдання 1: Знайти значення максимальної заробітної платні
    public double getMaxSalary() {
        double maxSalary = director.salary;

        for (Department department : departments) {
            maxSalary = Math.max(maxSalary, department.head.salary);

            for (Employee employee : department.employees) {
                maxSalary = Math.max(maxSalary, employee.salary);
            }
        }

        return maxSalary;
    }

    // Завдання 2: Визначити, відділ, в якому хоча б один з співробітників отримує заробітну платню вищу за платню свого начальника
    public Department findDepartmentWithHigherSalary() {
        for (Department department : departments) {
            Iterator<Employee> employeeIterator = department.employees.iterator();
            while (employeeIterator.hasNext()) {
                Employee employee = employeeIterator.next();
                if (employee.salary > department.head.salary) {
                    return department;
                }
            }
        }

        return null;
    }

    // Завдання 3: Скласти список усіх співробітників фірми, включаючи начальників та директора
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();

        allEmployees.add(director);

        for (Department department : departments) {
            allEmployees.add(department.head);

            Iterator employeeIterator = department.employees.iterator();
            while (employeeIterator.hasNext()) {
                allEmployees.add((Employee) employeeIterator.next());
            }
        }

        return allEmployees;
    }
}
