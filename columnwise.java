import java.util.Scanner;
public class columnwise {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter columns: ");
    int columns = in.nextInt();

    int [][] a = new int[rows][columns];

    System.out.println("Enter elements: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        a[i][j] = in.nextInt();
      }
    }
    // print column wise elements
    for(int j=0;j<columns;j++){  
      for(int i=0;i<rows;i++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
  
}
