package course.chapter15;

import java.io.*;

public class ReadWriteBinary {

    static byte[] bytes;

    public static void main(String[] args) {
        String filename = "/home/bogdan/Pictures/ranked.png";
        String filename2 = "/home/bogdan/Pictures/ranked2.png";

        readFileIntoArray(filename);
        writeArrayToFile(filename2);

    }

    static void readFileIntoArray(String fn) {
        FileInputStream fis = null;
        File f = new File(fn);
        long length = f.length();
        System.out.println(length);

        try {
            fis = new FileInputStream(f);
            bytes = new byte[(int) length];
            fis.read(bytes);
            System.out.println(bytes);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    static void writeArrayToFile(String fn) {
        FileOutputStream fos = null;
        File f = new File(fn);

        try {
            fos = new FileOutputStream(f);
            fos.write(bytes);
            System.out.println(bytes);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
