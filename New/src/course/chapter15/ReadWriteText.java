package course.chapter15;

import java.io.*;

public class ReadWriteText {

    static char[] chars;

    public static void main(String[] args) {
        String filename = "/home/bogdan/Desktop/myfile.txt";
        String filename2 = "//home/bogdan/Desktop/myfile2.txt";

        readFileIntoArray(filename);
        writeArrayToFile(filename2);

    }

    static void readFileIntoArray(String fn) {
        FileReader fr = null;
        File f = new File(fn);
        long length = f.length();
        System.out.println(length);

        try {
            fr = new FileReader(f);
            chars = new char[(int) length];
            fr.read(chars);
            System.out.println(chars);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    static void writeArrayToFile(String fn) {
        FileWriter fw = null;
        File f = new File(fn);

        try {
            fw = new FileWriter(f);
            fw.write(chars);
            System.out.println(chars);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
