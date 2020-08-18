package course.chapter11lab;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
//        Vehicle vehicle = new Vehicle(45, 3);
//        Bicycle bicycle = new Bicycle(30, 10);

        Object vehicles[] = new Object[3];
        vehicles[0] = new Bicycle(15, 10);
        vehicles[1] = new Bicycle(15, 3);
        vehicles[2] = new Vehicle();

        for (Object vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
