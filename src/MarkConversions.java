import java.util.Scanner;

public class MarkConversions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total amount of tests: ");
        int total = scan.nextInt();

        System.out.print("Marked tests: ");
        int marked = scan.nextInt();

        int result = marked * 100 / total;
        System.out.println("Results = " + result + "%");

    }
}
