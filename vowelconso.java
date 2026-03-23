// Count vowel and consonant in string
import java.util.Scanner;
public class vowelconso {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter string: ");
    String s = in.nextLine();

    int vowelcount = 0;
    int consonantcount = 0;

    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch == 'a'||ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
        vowelcount++;
      }else if(ch>='a' && ch<='z'){
        consonantcount++;
      }
    }
    System.out.println("Vowel is: "+vowelcount);
    System.out.println("Consonant is: "+consonantcount);
  }
  

}
