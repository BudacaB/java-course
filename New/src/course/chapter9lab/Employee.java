package course.chapter9lab;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private static int minWage = 50;
    private static int retirementAge = 60;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {
        this("John", "Doe");
    }

    public void showEmp() {
        System.out.println("Employee " + firstName + " " + lastName + " has a salary of $" + salary);
        System.out.println("The employee has a minimum wage of $" + minWage + " and will retire at " + retirementAge);
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
}
