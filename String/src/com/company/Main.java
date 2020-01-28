package com.company;

public class Main {

    public static void main(String[] args) {
//	    char letter1 = 'A';
//	    char letter2 = 'A';
//        System.out.println(letter1 == letter2);

        // 'new' makes separate memory space / without new they would both point to the same location - java optimization
        String letter1 = new String("A");
        String letter2 = new String("A");

        // compares pointers / memory address
        System.out.println(letter1 == letter2);

        // compares internals
        System.out.println(letter1.equals(letter2));

        String name1 = "Jean";
        String name2 = "JEAN";

        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.length());
    }
}
