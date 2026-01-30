// Print maximum element in array

import java.util.Scanner;
public class max {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter number of elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int max = arr[0];
    for(int i=0;i<n;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    System.out.println(max);
  }
  
}
