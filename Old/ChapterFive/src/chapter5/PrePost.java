package chapter5;

public class PrePost {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a = b++;
        System.out.println(a);
        System.out.println(b);

        a = 0;
        b = 0;

        a = ++b;
        System.out.println(a);
        System.out.println(b);
    }
}
