package course.chapter15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        try {
            Order order = new Order(1, "potatoes");

            FileWriter fw = new FileWriter("order.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println(order.getId());
            pw.println(order.getName());

            pw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
