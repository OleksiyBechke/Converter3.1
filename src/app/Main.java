package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for measure converting.");
        double F = 5;
        double C = 12;
        double celsius = convFahrenheitToCelsius(F);;
        double fahrenheit = convCelsiusToFahrenheit(C);
        System.out.println("Result is " + celsius + " degrees Celsius and " + fahrenheit + " degrees Fahrenheit.");
    }

    private static double convFahrenheitToCelsius(double F) {
        return (F - 32) / 1.8;
    }


    private static double convCelsiusToFahrenheit(double C) {
        return (C * 1.8) + 32;
    }
}