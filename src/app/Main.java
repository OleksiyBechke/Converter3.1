package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for measure converting.");
        double F = 5;
        double celsius = convFahrenheitToCelsius(F);
        System.out.println("Result is " + celsius + " degree Celsius.");
    }

    private static double convFahrenheitToCelsius(double F) {
        return (F - 32) / 1.8;
    }
}