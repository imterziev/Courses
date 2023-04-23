package JavaOOP.Encapsulation.Lab.FirstAndReserveTeam;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setFirstName(String firstName) {
        checkName(firstName, "First");

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        checkName(lastName, "Last");

        this.lastName = lastName;
    }

    private void checkName(String name, String prefix) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(prefix + " name cannot be less than 3 symbols");
        }
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus /= 2;
        }

        this.salary = this.salary * (1.00 + bonus / 100);
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.0###");
        return String.format("%s %s gets %s leva.",
                this.firstName, this.lastName, formatter.format(this.salary));
    }
}