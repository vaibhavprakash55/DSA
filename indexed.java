// Multiply odd indexed elements by 2 and add 10 to even indexed elements

import java.util.Scanner;
import java.util.Arrays;
public class indexed {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Size of array");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    for(int i=0;i<n;i++){
      if(i%2==0){
        arr[i] = arr[i]+10;
      }else if(i%2!=0){
        arr[i] = arr[i]*2;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  
}
