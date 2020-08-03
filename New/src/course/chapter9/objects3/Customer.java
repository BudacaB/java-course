package course.chapter9.objects3;

public class Customer {
    String firstName;
    String lastName;
    Account acc;

    void addAccount() {
//        acc = new Account();
//        acc.accountId = Account.getNextId();
//        acc.balance = 0;
//        acc.display();
        this.addAccount(0);
    }

    void addAccount(double initialBalance) {
        acc = new Account();
        acc.accountId = Account.getNextId();
        acc.balance = initialBalance;
        acc.display();
    }
}
