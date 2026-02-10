import java.util.Scanner;
public class scalarmatr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter column:");
    int column = in.nextInt();

    int [][] matrix = new int [rows][column];

    System.out.println("Enter elements in matrix 1: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        matrix[i][j]=in.nextInt();
      }
    }
    System.out.println("Enter Scalar value: ");
    int scalar = in.nextInt();

    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        matrix[i][j] = matrix[i][j]*scalar;
      }
    }
    System.out.println("Enter matrix after multiplication: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}
