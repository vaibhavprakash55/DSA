// Print sum of elements in array

import java.util.Scanner;
public class sum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i =0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int sum = 0;
    for(int i =0;i<n;i++){
      sum = sum+arr[i];
    }
    System.out.println(sum);

  }
  
}
