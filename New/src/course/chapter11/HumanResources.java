package course.chapter11;

public class HumanResources {

    public HumanResources() {
        Employee boss = new Employee("Lee", "Jen", 71, "Manager", 900000);
        Employee lead = new Employee("Bob", "Jean", 54, "Lead", 750000);

        Student s = new Student();
        isPastRetirement(s);

        if (isPastRetirement(boss)) {
            System.out.println(boss.getName() + " can retire");
        }
        if (isPastRetirement(lead)) {
            System.out.println(lead.getName() + " can retire");
        }
    }

    public boolean isPastRetirement(Person p) {
        // only available in Employee
        // float salary = p.getSalary();
        if (p instanceof Employee) {
            Employee emp = (Employee) p;
            float salary = emp.getSalary();
            System.out.println(salary);
        }

        if (p.getAge() > 65) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        new HumanResources();
    }
}
