
import java.util.Scanner;

public class TimeCalculations {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Please input seconds: ");
        long seconds = scan.nextLong();
        long sec = seconds % 60;
        long min = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds / 86400;
        System.out.println("Days = " + days + " Hours = " + hours + " Minutes = " + min + " Seconds = " + sec);


        System.out.print("Please input days: ");
        int inputDays = scan.nextInt();
        System.out.print("Please input hours: ");
        int inputHours = scan.nextInt();
        System.out.print("Please input minutes: ");
        int inputMin = scan.nextInt();
        System.out.print("Please input seconds: ");
        int inputSec = scan.nextInt();
        long resultInSeconds = (inputDays * 86400 + inputHours * 3600 + inputMin * 60 + inputSec);
        System.out.println(resultInSeconds);

    }
}
