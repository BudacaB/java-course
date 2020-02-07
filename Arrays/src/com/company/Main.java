package com.company;

public class Main {

//    public static void main(String[] args) {
//        String[] days = new String[7];
//
//        days[0] = "Mon";
//        days[1] = "Tue";
//        days[2] = "Wed";
//        days[3] = "Thu";
//        days[4] = "Fri";
//        days[5] = "Sat";
//        days[6] = new String("Sun");
//
//        System.out.println(days.length);
//        System.out.println(days[days.length - 1]);
//
//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[i]);
//        }
//    }

//    public static void main(String[] args) {
//        String[] days = new String[7];
//
//        System.out.println(args[0]);
//    }

    public static void main(String[] args) {
        int evens[] = new int[5];
        evens[0] = 0;
        evens[1] = 2;
        evens[2] = 4;
        evens[3] = 6;
        evens[4] = 8;

        int odds[] = { 1, 3, 5, 7, 9}; // other way to declare and insert values

        for (int i = 0; i < evens.length; i++) {
            System.out.println(evens[i]);
            System.out.println(odds[i]);
        }

        String name = "Bog";
        System.out.println(name.length());
    }
}
