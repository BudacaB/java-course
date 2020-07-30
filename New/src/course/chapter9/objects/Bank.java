package course.chapter9.objects;

public class Bank {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.firstName = "Bog";
        cust.lastName = "Dan";
        cust.addAccount(250.0);
    }
}
