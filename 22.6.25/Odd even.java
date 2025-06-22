import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        int evenCount = 0, oddCount = 0;
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 ==
