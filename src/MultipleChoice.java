import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Total amount of tests: ");
        int total = scan.nextInt();

        System.out.print("Passed tests: ");
        int passed = scan.nextInt();

        System.out.print("Failed tests: ");
        int failed = scan.nextInt();

        int passedResult = passed * 100 / total;
        int failedResult = failed * 100 / total;
        System.out.println("Results: passed = " + passedResult + "% ," + "failed = " + failedResult + "%" );

    }
}
