package course.chapter11;

public class Employee extends Person {
    private String title;
    private float salary;

    public Employee() {
        this("", "", 0, "Clerk", 20000);
    }

    public Employee(String firstName, String lastName, int age, String title, float salary) {
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

    @Override
    public String getName() {
        if (title.equals("Doctor"))
            return "Dr. " + firstName + " " + lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("Doe","Jane", 71);
        persons[1] = new Employee("Smith", "John", 45, "Doctor", 275000);
        persons[3] = new Student();

        for (Person person : persons) {
            System.out.println(person.getName());
        }
}
