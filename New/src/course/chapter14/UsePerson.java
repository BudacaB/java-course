package course.chapter14;

public class UsePerson {
    public static void main(String[] args) {
        Person p = null;
        String name = null;
        name = "Some name"; // comment this line to see an exception

        try {
            p = new Person(name);
        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(p);
    }
}
