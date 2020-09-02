package course.chapter14;

public class Person {
    private String name;
    private Integer age;

    public Person(String n, Integer a) throws InvalidDataException, BadAgeException {
        if (n == null || n.equals("")) {
            throw new InvalidDataException(n);
        }
        name = n;
        if (a < 0 || a > 120) {
            throw new BadAgeException();
        }
        age = a;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
