// Q1. Sum of Each Row 
// Write a program to calculate sum of each 
// row in a matrix. 

import java.util.Scanner;
public class sumrow {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter rows: ");
    int rows = in.nextInt();
    System.out.println("Enter columns: ");
    int columns = in.nextInt();

    int[][] a = new int[rows][columns];
    

    System.out.println("Enter element in matrix a: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        a[i][j] = in.nextInt();
      }
    }
    for(int i=0;i<rows;i++){
      int sum = 0;
      for(int j=0;j<columns;j++){
        sum = sum +a[i][j];
      }
      System.out.println(sum);
    }
    
  }
}
