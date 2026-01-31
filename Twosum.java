// Two Sum

import java.util.Scanner;
public class Twosum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    System.out.println("Enter target element for two sum: ");
    int target = in.nextInt();

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==target){
          System.out.println("Exists");
        }else{
          System.out.println("Not Exists");
        }
      }
    }
    
  }
  
}
