package com.company;

public class Main {

    public static void main(String[] args) {
        String[] days = new String[7];

        days[0] = "Mon";
        days[1] = "Tue";
        days[2] = "Wed";
        days[3] = "Thu";
        days[4] = "Fri";
        days[5] = "Sat";
        days[6] = "Sun";

        System.out.println(days.length);

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
