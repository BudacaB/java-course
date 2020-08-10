package course.chapter11;

public class Employee1 extends Person {
    private String title;
    private float salary;

    public Employee1() {
        this("", "", 0, "Clerk", 20000);
    }

    public Employee1(String firstName, String lastName, int age, String title, float salary) {
        super(firstName, lastName, age);
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getSalary() {
        return salary;
    }
}
