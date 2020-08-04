package course.chapter9.objects3;

public class Customer {
    // fields
    private String firstName;
    private String lastName;
    private Account acc;

    // constructors
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
        this("John", "Doe");
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

    public Account getAcc() {
        return acc;
    }

    public String Name() {
        return firstName + " " + lastName;
    }
}
