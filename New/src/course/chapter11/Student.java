package course.chapter11;

public class Student extends Person {
    public Student() {
    }

    @Override
    public String getName() {
        System.out.println("Student getName");
        return "The Student";
    }
}
