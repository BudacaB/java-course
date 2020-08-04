package course.chapter10;

public class PrintToConsole {

    public static void main(String[] args) {
//        System.out.printf("PI to 2 and 10 decimal places: %1$.2f %1$.10f", Math.PI);

        int a = 17;
        int b = -445;

        System.out.printf("Negative in parens: %1$+d%n", a);
        System.out.printf("Negative in parens: %1$5d%n", a);

        String fs = "The average of %1$d, %2$d, and %3$d is %4$.2f%n";
        System.out.printf(fs, 13, 4, 6, ((12 + 4 + 6) / 3.0));
    }
}
