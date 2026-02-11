import java.util.Scanner;
public class transposematri {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter columns: ");
    int columns = in.nextInt();

    int[][] original = new int[rows][columns];
    System.out.println("Enter elements: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        original[i][j] = in.nextInt();
      }
    }
    int[][] transpose = new int[columns][rows];
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        transpose[j][i] = original[i][j];
      }
    }
    // Print transpose matrix
    for(int i=0;i<columns;i++){
      for(int j=0;j<rows;j++){
        System.out.print(transpose[i][j]+" ");
      }
      System.out.println();
    }
  }
  
}
