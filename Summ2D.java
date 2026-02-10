import java.util.Scanner;
public class Summ2D {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter columns: ");
    int columns = in.nextInt();

    int[][] matrix = new int[rows][columns];
    int sum = 0;
    System.out.println("Enter elements in matrix: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        matrix[i][j] = in.nextInt();
        sum = sum+matrix[i][j];
        
      }
      
    }
    System.out.println(sum);

  }
  
}
