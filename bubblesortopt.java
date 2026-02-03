// Optimized bubble sort

import java.util.Scanner;
public class bubblesortopt {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    for(int i=0;i<n-1;i++){
      boolean isSorted = true;
      for(int j=0;j<n-1;j++){
        if(arr[j]>arr[j+1]){
          isSorted = false;
          break;
        }
      }
      if(isSorted==true) break;
      for(int j=0;j<n-1;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
