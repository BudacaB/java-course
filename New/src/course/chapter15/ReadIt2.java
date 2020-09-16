package course.chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadIt2 {
    public static void main(String[] args) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("text.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
