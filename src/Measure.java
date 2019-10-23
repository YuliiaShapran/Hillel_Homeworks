
import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input meters: " );
        double a = scan.nextDouble();
        double inches = a * 39.37D;
        System.out.println("In the result inches = " + inches);

        System.out.print("Please input inches: " );
        double b = scan.nextDouble();
        double meters = b / 39.37D;
        System.out.println("In the result meters = " + meters);

        System.out.print("Please input miles: ");
        double c = scan.nextDouble();
        double kilometres = 1.609D * c;
        System.out.println("In the result kilometres = " + kilometres);

        System.out.print("Please input kilometres: ");
        double d = scan.nextDouble();
        double miles = d/1.609D;
        System.out.println("In the result miles = " + miles);

        System.out.print("Please input kilograms: ");
        double e = scan.nextDouble();
        double pounds = e * 2.2046D;
        System.out.println("In the result pounds = " + pounds);

        System.out.print("Please input pounds: ");
        double f = scan.nextDouble();
        double kilograms = f/2.2046D;
        System.out.println("In the result kilograms = " + kilograms);

        System.out.print("Please input km/hr: ");
        double h = scan.nextDouble();
        double mihr = h * 0.6214D;
        System.out.println("In the result mi/hr = " + mihr);

        System.out.print("Please input mi/hr: ");
        double i = scan.nextDouble();
        double kmhr = i/0.6214D;
        System.out.println("In the result km/hr = " + kmhr);
    }
}
