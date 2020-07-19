package course.chapter8lab;

public class Employee extends Person {

    private float salary;
    private String dept;
    private static int empCount;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static int getEmpCount() {
        return empCount;
    }

    public static void setEmpCount(int empCount) {
        Employee.empCount = empCount;
    }

    public static int empCount() {
        return empCount;
    }
}
