// Check if array is sorted or not;

import java.util.Scanner;
public class sorted {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]>arr[i+1]){
        System.out.println("False, Not Sorted");
        break;
      }else{
        System.out.println("True, Sorted");
        break;
      }
    }
  }
  
}
