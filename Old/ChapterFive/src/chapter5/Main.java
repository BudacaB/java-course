package chapter5;

public class Main {

    public static void main(String[] args) {
//	    short a = 1;
//	    short b = 2;
//	    short c = 3;
//	    int d = a + b + c;
//
//        System.out.println(d);

        int speed = 35;
        int speedLimit = 30;

        System.out.println("Speed: " + speed);
        System.out.println("Speed limit: " + speedLimit);

        boolean result = speed < speedLimit;
        System.out.println("speed < speedLimit results in: ");
        System.out.println(result);

        result = speed > speedLimit;
        System.out.println("speed > speedLimit results in: ");
        System.out.println(result);

    }
}
