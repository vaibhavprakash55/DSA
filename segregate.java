// Segregate 0's abd 1's
import java.util.Scanner;
public class segregate {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements in 0 and 1");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int noz = 0;
    int noone = 0;
    for(int i=0;i<noz;i++){
      arr[i] = 0;
    }
    for(int i= noz;i<n;i++){
      arr[i] = 1;
    }
    System.out.println(noz);
  }
  
}


// phir se samjhana iss ques ko
