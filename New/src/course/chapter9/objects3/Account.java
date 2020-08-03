package course.chapter9.objects3;

public class Account {
    // fields
    double balance;
    String accountId;
    static int nextId = 0;
    static final int ROUTING_NUMBER = 123456789;

    // methods
    void deposit(double amount) {
        balance +=amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("**Account info**");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance);
    }

    static String getNextId() {
        return "ACCT " + Account.nextId++;
    }
}
