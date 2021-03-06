package course.chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteBook {
    public static void main(String[] args) {
        Book b = new Book("Animal farm", "George Orwell", 1945, 144);

        try {
            FileOutputStream fout = new FileOutputStream("Book.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(b);
            out.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
