package course.chapter9lab;

public class EmpTest {
    public static void main (String[] args) {
        Employee emp = new Employee("Jim", "Cage", Title.CEO);
//        emp.setFirstName("Jim");
//        emp.setLastName("Cage");
        emp.setSalary(500.0);
        emp.showEmp();

        Employee emp2 = new Employee();
        emp2.setSalary(500.0);
        emp2.showEmp();

        System.out.println(emp);
        System.out.println(emp.equals(emp2));
        System.out.printf("Salary is: %.2f", emp.getSalary());
    }
}
