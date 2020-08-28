package course.chapter13;

import java.util.ArrayList;

public class Months2 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");

        for (String month : months) {
            System.out.println(month);
        }
    }
}
