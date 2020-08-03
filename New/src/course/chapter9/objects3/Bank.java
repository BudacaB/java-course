package course.chapter9.objects3;

public class Bank {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.firstName = "Bog";
        cust.lastName = "Dan";
        cust.addAccount();

        Customer cust2 = new Customer();
        cust.firstName = "Jimmy";
        cust.lastName = "Jim";
        cust.addAccount(500.0);
    }
}
