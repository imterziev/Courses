package JavaAdvanced.DefiningClasses.Exercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departments = new HashMap<>();

        List<Employee> employeesList = new ArrayList<>();

        while (numberOfEmployees-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = null;

            if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);

                employee = new Employee(name, salary, position, department, email, age);
            } else if (input.length == 5) {
                try {
                    int age = Integer.parseInt(input[4]);

                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = input[4];

                    employee = new Employee(name, salary, position, department, email);
                }
            }

            employeesList.add(employee);

            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);
        }

        Department highestPaidDepartment = departments.entrySet()
                .stream()
                .max(Comparator.comparing(e -> e.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        System.out.printf("Highest Average Salary: %s\n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }
}