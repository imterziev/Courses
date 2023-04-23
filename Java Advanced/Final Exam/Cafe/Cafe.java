package JavaAdvanced.FinalExam.Cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (this.capacity > this.employees.size()) {
            this.employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        return this.employees.remove(returnEmployee(name));
    }

    public Employee getOldestEmployee() {
        return this.employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
    }

    public Employee getEmployee(String name) {
        return returnEmployee(name);
    }

    private Employee returnEmployee(String name) {
        Employee employee = null;

        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                employee = e;
            }
        }

        return employee;
    }

    public int getCount() {
        return this.employees.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder(String.format("Employees working at Cafe %s:\n", this.name));

        for (Employee employee : employees) {
            stringBuilder.append(employee).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}