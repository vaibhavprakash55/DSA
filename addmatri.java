import java.util.Scanner;
public class addmatri {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter column:");
    int column = in.nextInt();

    int [][] a= new int[rows][column];
    int [][] b = new int[rows][column];
    int [][] sum = new int[rows][column];

    System.out.println("Enter elements in matrix 1: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        a[i][j]=in.nextInt();
      }
    }
    System.out.println("Enter elements in matrix 2: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        b[i][j] = in.nextInt();
      }
    }
    // for(int i=0;i<rows;i++){
    //   for(int j=0;j<column;j++){
    //     sum[i][j] = a[i][j]+b[i][j];
    //   }
    // }  // for addition
    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        sum[i][j] = a[i][j]-b[i][j];
      }
    } // for subtraction
    System.out.println("Sum of matrices: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<column;j++){
        System.out.print(sum[i][j]+" ");
      }
      System.out.println();
    }
  }
  
}
