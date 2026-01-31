// Rotate Array
import java.util.Scanner;
public class Rotate {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    System.out.println("Enter rotate value; ");
    int r = in.nextInt();

    r = r%n;
    //reverse first r elements
    int i,j,temp;
    i=0;
    j=r-1;
    while(i<j){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    //reverse remaining r elements
    i=r;
    j=n-1;
    while(i<j){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    //reverse whole array
    i=0;
    j = n-1;
    while(i<j){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    for(int ele:arr){
      System.out.print(ele + " ");
    }

  }
  
}
