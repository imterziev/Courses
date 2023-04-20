package ProgrammingFundamentals.ObjectsAndClasses.Lab.Students2;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Students(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
    }
}