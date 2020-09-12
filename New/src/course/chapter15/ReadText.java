package course.chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
