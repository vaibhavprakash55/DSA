//Missing number in array
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n (range 1 to n):");
        int n = in.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
        }

        // sum of 1 to n
        int totalSum = n * (n + 1) / 2;

        // sum of array elements
        int arrSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arrSum += arr[i];
        }

        int missingNumber = totalSum - arrSum;

        System.out.println("Missing number is: " + missingNumber);
    }
}

