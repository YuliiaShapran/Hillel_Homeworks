import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input Fahrenheit temperature: ");
        double a = scan.nextDouble();

        double Celsius = 5d/9d * (a - 32);
        System.out.println("Celsius temperature is = " + Celsius);

        System.out.println("Input Celsius temperature: ");
        double b = scan.nextDouble();

        double Fahrenheit = b * 9d/5d + 32;
        System.out.println("Fahrenheit temperature is = " + Fahrenheit);

        System.out.println("Input Celsius temperature: ");
        double c = scan.nextDouble();

        double Kelvin = c + 273.16;
        System.out.println("Kelvin temperature is = " + Kelvin);
    }
}
