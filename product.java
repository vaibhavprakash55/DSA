// print product of elements of array

import java.util.Scanner;
public class product {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Size of array");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int multiply = 1;
    for(int i=0;i<n;i++){
      multiply = multiply*arr[i];
    }
    System.out.println(multiply);
  }
  
}
