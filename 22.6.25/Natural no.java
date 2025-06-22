import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;  // Using formula
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}
