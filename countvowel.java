// Count the number of vowels in a given string
import java.util.Scanner;
public class countvowel {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter string: ");
    String s = in.nextLine();
      
      int count = 0;
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
          count++;
        }
      }
      System.out.println(count);
    }
    
  }
  

