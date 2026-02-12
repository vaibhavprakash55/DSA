// Maximum frequency element in array
import java.util.Scanner;
public class maxfrequency {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = in.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter number of elements: ");
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int maxfreq = 0;
    int element = arr[0];

    for(int i=0;i<n;i++){
      int count = 0;
      for(int j=0;j<n;j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }
      if(count>maxfreq){
        maxfreq = count;
        element = arr[i];
      }
    }
    System.out.println("Maximum frequency element: "+element);
    System.out.println("Frequency: "+maxfreq);
  }
  
}
