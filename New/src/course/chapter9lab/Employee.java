package course.chapter9lab;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private static int minWage = 50;
    private static int retirementAge = 60;
    private Title title;

    public Employee(String firstName, String lastName, Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    public Employee() {
        this("John", "Doe", Title.ENGINEER);
    }

    public void showEmp() {
        System.out.println("Employee " + firstName + " " + lastName + " has a salary of $" + salary + " and works as " + title);
        System.out.println("The employee has a minimum wage of $" + minWage + " and will retire at " + retirementAge);
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + String.format("%.2f", salary) +
                ", title=" + title +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                title == employee.title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, title);
    }
}
