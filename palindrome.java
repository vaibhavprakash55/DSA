// Check Palindrome string
import java.util.Scanner;
public class palindrome {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter string: ");
    String s = in.nextLine();
    
    int i = 0;
    int j = s.length()-1;
    boolean isPalindrome = true;

    while(i<j){
      if(s.charAt(i)!=s.charAt(j)){
        isPalindrome = false;
        break;
      }
      i++;
      j--;
    }
    if(isPalindrome){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
    }
  }
  
}
