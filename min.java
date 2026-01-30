// Print minimum element in array

import java.util.Scanner;
public class min {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter number of elements");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int min = arr[0];
    for(int i=0;i<n;i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    System.out.println(min);
  }
  
}
