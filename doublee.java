// Input number in form of array and print its double
import java.util.Scanner;
public class doublee {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int [] arr = new int[7];
    for(int i=0;i<7;i++){
      arr[i] = in.nextInt();
    }
    for(int i=0;i<7;i++){
      System.out.println(2*arr[i]+" ");
    }
  }
  
}
