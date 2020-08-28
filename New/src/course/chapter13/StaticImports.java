package course.chapter13;

import static java.lang.Math.*;
import static java.lang.System.out;


public class StaticImports {
    public static void main(String[] args) {
        int radius = 5;
        double area = PI * pow(radius, 2);

        out.printf("The area of the circle with radius %1$d is %2$.2f %n", radius, area);
    }
}
