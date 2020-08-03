package course.chapter9.objects2;

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
}
