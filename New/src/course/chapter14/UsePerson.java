package course.chapter14;

public class UsePerson {
    public static void main(String[] args) {
        Person p = null;
        String name = null;
        Integer age = null;
        name = "Some name"; // comment this line to see an exception
        age = 15;
//        age = -5;
//        age = 130;

        try {
            p = new Person(name, age);
        } catch (InvalidDataException | BadAgeException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(p);
    }
}
