package course.chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
    public static void main(String[] args) {
        try (
            FileReader fr = new FileReader(args[1]);
            BufferedReader br = new BufferedReader(fr);
            ) {
            String line;
            while((line = br.readLine()) != null) {
                if (line.toLowerCase().indexOf(args[0]) > 0) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
