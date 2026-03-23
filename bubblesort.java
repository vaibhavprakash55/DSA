// Bubble Sort

import java.util.Scanner;
public class bubblesort {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    for(int i=0;i<n-1;i++){      // This is for outer pass
      for(int j=0;j<n-i-1;j++){    // This is for inner pass
      if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
    }
    for(int j=0;j<n;j++){
      System.out.print(arr[j]+" ");
    }
    
  }
  
}
