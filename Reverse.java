// Resverse Array
import java.util.Scanner;
public class Reverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int i=0, j=n-1;
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    for(int ele:arr){
      System.out.print(ele + " ");
    } // hmlog ko array me koi changes to nhi krna issiliye we use for each loop
  }
  
}

// agar beech ke sirf koi element ko reverse krna h to sirf i aur j me changes hoga , indexing dekh lena bss

