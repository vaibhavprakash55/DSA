// Matrix Diagonal Sum
import java.util.Scanner;
public class diagonalsum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter columns: ");
    int columns = in.nextInt();
    int [][] a = new int[rows][columns];
    int sum = 0;
    System.out.println("Enter elements: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        a[i][j] = in.nextInt();
      }
    }
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        if(i==j){
          sum +=a[i][j];
        }
        if(i+j==rows-1){
          sum += a[i][j];
        }
      }
    }
    if(rows%2!=0){
      int mid = rows/2;
      sum -= a[mid][mid];
    }
    System.out.println("Diagonal sum is: " +sum);
  }
  
}
