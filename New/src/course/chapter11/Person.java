package course.chapter11;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;

    public Person() {
        this("", "", 0);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }
}
