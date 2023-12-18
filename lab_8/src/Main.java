import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Створення працівників
        Employee director = new Employee("John", "Doe", 100000.0);
        Employee head1 = new Employee("Alice", "Smith", 80000.0);
        Employee head2 = new Employee("Bob", "Johnson", 75000.0);
        Employee employee1 = new Employee("Eva", "Davis", 60000.0);
        Employee employee2 = new Employee("Chris", "Williams", 70000.0);
        Employee employee3 = new Employee("Grace", "Brown", 65000.0);

        // Створення відділів
        Department department1 = new Department("HR", head1);
        department1.addEmployee(employee1);

        Department department2 = new Department("IT", head2);
        department2.addEmployee(employee2);
        department2.addEmployee(employee3);

        // Створення фірми
        Company company = new Company("XYZ Company", director);
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Завдання 1: Знайти значення максимальної заробітної платні
        double maxSalary = company.getMaxSalary();
        System.out.println("Максимальна заробітна платня: " + maxSalary);

        // Завдання 2: Визначити, відділ, в якому хоча б один з співробітників отримує більше за свого начальника
        Set<Department> departmentsWithHigherSalary = company.findDepartmentsWithHigherSalary();
        System.out.println("Відділи з працівниками, які отримують більше за свого начальника: " + departmentsWithHigherSalary);

        // Завдання 3: Скласти список усіх співробітників фірми, включаючи начальників та директора
        Set<Employee> allEmployees = company.getAllEmployees();
        System.out.println("Усі співробітники фірми:");
        for (Employee employee : allEmployees) {
            System.out.println(employee.firstName + " " + employee.lastName + " - " + employee.salary);
        }
    }
}