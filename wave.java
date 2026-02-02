// wave array
import java.util.Scanner;
public class wave {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
   
    for(int i=0;i<n;i=i+2){
      if(i==n-1){
        break;
      }
      int temp = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = temp;
    }
    for(int ele:arr){
      System.out.print(ele+" ");
    }
  }
  
}
