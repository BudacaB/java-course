package course.chapter9lab;

public class EmpTest {
    public static void main (String[] args) {
        Employee emp = new Employee("Jim", "Cage");
//        emp.setFirstName("Jim");
//        emp.setLastName("Cage");
        emp.setSalary(500.0);
        emp.showEmp();

        Employee emp2 = new Employee();
        emp2.setSalary(650.0);
        emp2.showEmp();
    }
}
