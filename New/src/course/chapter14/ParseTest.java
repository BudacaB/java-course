package course.chapter14;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParseTest {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String s;
        Number num;
//        s = "$45.67";
        s = "hi mom";

        try {
            num = format.parse(s);
            System.out.println("Float value = " + num.floatValue());
        } catch (ParseException e) {
            System.err.println("Invalid string \"" + s + "\"");
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        System.out.println("here");
    }
}
