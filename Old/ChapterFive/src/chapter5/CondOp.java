package chapter5;

public class CondOp {
    public static void main(String[] args) {
        char status;
        int age = 16;
        status = age >= 18 ? 'a' : 'm';
        System.out.println(status);
    }
}
