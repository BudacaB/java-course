package course.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String name;
    private String favFood;
    private int age;

    public Person(String name, String favFood, int age) {
        this.name = name;
        this.favFood = favFood;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", favFood='" + favFood + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        String firstName = null;
        String food = null;
        int age = 0;

        try {
            InputStreamReader conv = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(conv);

            System.out.println("What is your first name? ");
            firstName = buf.readLine();
            System.out.println("How old are you " + firstName + "? ");
            age = Integer.parseInt(buf.readLine());
            System.out.println("And what is your fav food? ");
            food = buf.readLine();
            buf.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        Person p = new Person(firstName, food, age);
        System.out.println(p);
    }
}
