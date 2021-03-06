package course.chapter14;

public class PeopleTest {
    public static void main(String[] args) {
        Person[] people;

        people = new Person[3];
        try {
            people[0] = new Person("Bob", 20);
            people[1] = new Person("Jane", 25);
            people[2] = new Person("John",33);
        } catch (InvalidDataException | BadAgeException e) {
            System.err.println(e.getMessage());
        }

        // produces ArrayIndexOutOfBoundsException, a RuntimeException
        for (int i = 0; i < 4; i++)
            System.out.println("people[" + i + "] contains " + people[i]);

        // use the array length to avoid the RuntimeException
        for (int i = 0; i < people.length; i++)
            System.out.println("people[" + i + "] contains " + people[i]);
    }
}
