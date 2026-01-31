// Print second largest element in array

import java.util.Scanner;
public class secondmax {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int arr[] = new int [n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int secondlar = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(max<arr[i]){
        max = arr[i];
      }
    }
    for(int i=0;i<n;i++){
      if(arr[i]>secondlar && arr[i] != max){
        secondlar = arr[i];
      }
    }
    System.out.println("Maximum element is: "+max);
    System.out.println("Second Maximum element is: "+ secondlar);
  }
}
