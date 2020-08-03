package course.chapter9.objects2;

public class Bank {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.firstName = "Bog";
        cust.lastName = "Dan";
        cust.addAccount(250.0);

        Customer cust2 = new Customer();
        cust.firstName = "Jimmy";
        cust.lastName = "Jim";
        cust.addAccount(500.0);
    }
}
