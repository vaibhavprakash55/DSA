import java.util.Scanner;
public class matrix1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter column: ");
    int columns = in.nextInt();

    int[][] matrix = new int[rows][columns];

    // enter elements
    System.out.println("Enter elements: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        matrix[i][j] = in.nextInt();
      }
    }
    // Printing Matrix
    System.out.println("Matrix is: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    
  }
  
}
