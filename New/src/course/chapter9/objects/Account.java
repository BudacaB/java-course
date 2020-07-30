package course.chapter9.objects;

public class Account {
    // fields
    double balance;

    // methods
    void deposit(double amount) {
        balance +=amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}
