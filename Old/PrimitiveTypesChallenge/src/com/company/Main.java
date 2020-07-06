package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 120;
        short myShort = 32220;
        int myInt = 5;
        long myLong = 50000L + 10L * (myByte + myShort + myInt) ;
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 *
                (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
