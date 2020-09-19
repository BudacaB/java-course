package course.chapter15;

import java.io.*;

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

            // text
//            FileWriter fw = new FileWriter("order.txt");
//            PrintWriter pw = new PrintWriter(fw);
//
//            pw.println(order.getId());
//            pw.println(order.getName());
//
//            pw.close();

            // binary
//            FileOutputStream fout = new FileOutputStream("order.dat");
//            DataOutputStream dout = new DataOutputStream(fout);
//
//            dout.writeInt(order.getId());
//            dout.writeUTF(order.getName());
//
//            dout.close();

            // serialized
            FileOutputStream fout = new FileOutputStream("order.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(order);
            out.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
