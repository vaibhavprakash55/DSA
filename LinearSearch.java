//Search element in array

import java.util.Scanner;
public class LinearSearch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    System.out.println("Enter target element: ");
    int target = in.nextInt();
    boolean flag = false; // false means target array se nhi h

    for(int i=0;i<n;i++){
      if(arr[i] == target){
        flag =true;
        break;
      }
    }
    if(flag==true){
      System.out.println( "Target exists in array");
    }else{
      System.out.println("Target not exixts");
    }
  }
  
}
