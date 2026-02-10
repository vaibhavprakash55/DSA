import java.util.Scanner;
public class maxsumrow {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter Columns: ");
    int columns = in.nextInt();

    int[][] a = new int[rows][columns];
    
    System.out.println("Enter elements: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        a[i][j] = in.nextInt(); 
      }
    }
    int maxsum = Integer.MIN_VALUE;
    int maxrow = -1;

    for(int i=0;i<rows;i++){
      int rowsum = 0;
      for(int j=0;j<columns;j++){
        rowsum += a[i][j];    // fix row and traverse only column
      }
      if(rowsum>maxsum){      // check condition and update it`
        maxsum = rowsum;
        maxrow = i;
      }
    }
    System.out.println("Row with maximum sum is: "+maxrow);
    System.out.println("Maximum sum is: "+maxsum);
  }

}
