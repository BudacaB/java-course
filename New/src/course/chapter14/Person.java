package course.chapter14;

public class Person {
    private String name;

    public Person(String n) throws InvalidDataException {
        if (n == null || n.equals("")) {
            throw new InvalidDataException(n);
        }
        name = n;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
