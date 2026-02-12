import java.util.Scanner;
public class multiply {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows of first matrix: ");
    int r1 = in.nextInt();
    System.out.println("Enter column of first matrix: ");
    int c1 = in.nextInt();

    System.out.println("Enter rows of second matrix: ");
    int r2 = in.nextInt();
    System.out.println("Enter matrix of second column: ");
    int c2 = in.nextInt();

   

    int [][] a= new int[r1][c1];
    int [][] b = new int[r2][c2];
    int [][] multiply = new int[r1][c2];
    System.out.println("Enter elements in matrix 1");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        a[i][j] = in.nextInt();
      }
    }
    System.out.println("Enter elements in matrix 2");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        b[i][j] = in.nextInt();
      }
    }
    for(int i=0;i<r1;i++){
      for(int j=0;j<c2;j++){
        for (int k = 0; k < c1; k++) {
          multiply[i][j] += a[i][k] * b[k][j];
                }
        
      }
    }
     System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
  }
  
}
