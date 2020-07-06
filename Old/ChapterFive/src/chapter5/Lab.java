package chapter5;

public class Lab {
    public static void main(String[] args) {
        float fahrenheit = 212f;
        float celsius;

        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println((int)celsius);

        float d1 = 24.0f;
        float d2 = 23.67f;
        float d3 = 45.8f;
        float d4 = 8.3f;
        float d5 = 0f;
        float d6 = 0.6f;
        float d7 = 14.6f;

        float totalWeek = d1 + d2 + d3 + d4 + d5 + d6 + d7;
        float weekAvg = totalWeek / 2;

        System.out.println(totalWeek);
        System.out.println(weekAvg);

        int i = 256;
        int j = 7;

        int nextMultiple = i + j - i % j;
        System.out.println(nextMultiple);
    }
}
