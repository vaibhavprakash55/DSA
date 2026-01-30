// Print negatives elements only

import java.util.Scanner;;
public class negative {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Size of array");
    int n = in.nextInt();
    int [] arr= new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    
    System.out.println("Elements are: ");
    for(int i=0;i<n;i++){
      if(arr[i]<0){
        System.out.print(arr[i]+" ");
      }
    }
  }
}
