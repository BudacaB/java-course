package course.chapter9.objects2;

public class Customer {
    String firstName;
    String lastName;
    Account acc;

    void addAccount(double initialBalance) {
        acc = new Account();
        acc.accountId = "ACCT-" + Account.nextId++;
        acc.balance = initialBalance;
        System.out.println(acc.accountId + " added");
    }
}
