package course;

public class Chapter7Lab {

    public static void main (String[] args)
    {
        System.out.println(conversion(fahrenheitToCelsius(68)));
        System.out.println(conversion(celsiusToFahrenheit(20)));
    }

    static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static float celsiusToFahrenheit(float celsius) {
        return (float) (celsius * 1.8 + 32);
    }

    static String conversion(float value) {
        return "The result is " + value;
    }
}
