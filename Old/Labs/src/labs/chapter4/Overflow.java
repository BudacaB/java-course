package labs.chapter4;

public class Overflow {
    static int big = 2147483647;
    static int bigger = big + 1;

    public static void main (String[] args) {
        System.out.println(big);
        System.out.println(bigger);

        // the integer overflows to negative
    }
}
