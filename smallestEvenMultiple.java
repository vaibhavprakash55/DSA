import java.util.Scanner;

public class smallestEvenMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(n * 2);
        }
    }
}
