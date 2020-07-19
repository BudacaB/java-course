package course.chapter8lab;

public class Chapter8Lab {

    public static void main (String[] args) {
        Person person = new Person();

        person.setFirstName("Bob");
        person.setLastName("Bill");
        person.setAge(30);
        person.setGender("male");

        person.display();
    }
}
