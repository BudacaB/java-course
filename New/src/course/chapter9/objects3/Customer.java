package course.chapter9.objects3;

public class Customer {
    // fields
    String firstName;
    String lastName;
    Account acc;

    // constructors
    Customer(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    Customer() {
        this("John", "Doe");
//        firstName = "John";
//        lastName = "Doe";
    }

    // methods
    void addAccount() {
        this.addAccount(0);
    }

    void addAccount(double initialBalance) {
        acc = new Account();
        acc.accountId = Account.getNextId();
        acc.balance = initialBalance;
        System.out.println(firstName + "'s" + " account has been created");
        acc.display();
    }
}
