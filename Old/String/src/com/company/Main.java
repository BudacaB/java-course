package com.company;

public class Main {

    public static void main(String[] args) {
//	    char letter1 = 'A';
//	    char letter2 = 'A';
//        System.out.println(letter1 == letter2);
//
//        // 'new' makes separate memory space / without new they would both point to the same location - java optimization
//        String letter3 = new String("A");
//        String letter4 = new String("A");
//
//        // compares pointers / memory address
//        System.out.println(letter3 == letter4);
//
//        // compares internals
//        System.out.println(letter3.equals(letter4));
//
//        String name1 = "Jean";
//        String name2 = "JEAN";
//
//        System.out.println(name1.equalsIgnoreCase(name2));
//        System.out.println(name1.length());

        String orig = "xyz";
        String dup = "xyz";
        String other = new String("xyz");

        System.out.println(orig == dup);
        System.out.println(orig == other);
        System.out.println(orig.equals(dup));
        System.out.println(orig.equals(other));
    }
}
