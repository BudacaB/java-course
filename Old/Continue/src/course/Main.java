package course;

public class Main {

    public static void main(String[] args) {
        int day;
        for (day = 1; day <= 7; day ++)
        {
            if (day == 6 || day ==7)
            {
                System.out.println("It's a weekend");
                continue;
            }
            System.out.println("Get ready");
            System.out.println("Work");
        }
    }
}
