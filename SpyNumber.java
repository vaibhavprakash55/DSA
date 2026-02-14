// Spy Number : sum of digit = Product of digit
import java.util.Scanner;
public class SpyNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter number: ");
    int n = in.nextInt();
    int temp = n;
    int sum = 0;
    int product = 1;
    while(temp>0){
      int digit = temp%10;
      sum = sum + digit;
      product = product *digit;
      temp = temp/10;
    }
    if(sum==product){
      System.out.println("Spy Number");
    }else{
      System.out.println("Not a Spy Number ");
    }
  }
}
