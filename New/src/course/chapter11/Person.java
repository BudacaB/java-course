package course.chapter11;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

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
