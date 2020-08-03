package course.chapter9.objects3;

public class Customer {
    String firstName;
    String lastName;
    Account acc;

    Customer(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    Customer() {
        firstName = "John";
        lastName = "Doe";
    }

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
