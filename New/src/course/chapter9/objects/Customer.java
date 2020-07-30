package course.chapter9.objects;

public class Customer {
    String firstName;
    String lastName;
    Account acc;

    void addAccount(double initialBalance) {
        acc = new Account();
        acc.balance = initialBalance;
        System.out.println("Account added for " + firstName + " " + lastName);
    }
}
