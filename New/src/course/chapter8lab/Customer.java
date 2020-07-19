package course.chapter8lab;

public class Customer extends Person {

    private float discount;
    private float balance;
    private static float returningCustDiscount;

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static float getReturningCustDiscount() {
        return returningCustDiscount;
    }

    public static void setReturningCustDiscount(float returningCustDiscount) {
        Customer.returningCustDiscount = returningCustDiscount;
    }
}
