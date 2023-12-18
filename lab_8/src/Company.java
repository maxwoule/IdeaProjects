import java.util.*;
public class Company {
    String name;
    Employee director;
    Set<Department> departments;
    Map<Employee, Department> employeeDepartmentMap;

    public Company(String name, Employee director) {
        this.name = name;
        this.director = director;
        this.departments = new HashSet<>();
        this.employeeDepartmentMap = new HashMap<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);

        for (Employee employee : department.employees) {
            employeeDepartmentMap.put(employee, department);
        }
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

    // Завдання 2: Визначити, відділ, в якому хоча б один з співробітників отримує заробітну
    // платню вищу за платню свого начальника
    public Set<Department> findDepartmentsWithHigherSalary() {
        Set<Department> departmentsWithHigherSalary = new HashSet<>();

        for (Department department : departments) {
            Iterator<Employee> employeeIterator = department.employees.iterator();
            while (employeeIterator.hasNext()) {
                Employee employee = employeeIterator.next();
                if (employee.salary > department.head.salary) {
                    departmentsWithHigherSalary.add(department);
                    break;
                }
            }
        }

        return departmentsWithHigherSalary;
    }

    // Завдання 3: Скласти список усіх співробітників фірми, включаючи начальників та директора
    public Set<Employee> getAllEmployees() {
        Set<Employee> allEmployees = new HashSet<>();

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
