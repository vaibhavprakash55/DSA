// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
// Example 2:

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
// Example 3:

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17

import java.util.Scanner;
public class RichestCustomerwealth {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter row: ");
    int m = in.nextInt();
    System.out.println("Enter columns: ");
    int n = in.nextInt();

    int[][] accounts = new int[m][n];
    
    System.out.println("Enter elements: ");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        accounts[i][j] = in.nextInt();
      }
    }
    int maxwealth = 0;
    for(int i=0;i<m;i++){
      int currentsum =0;
      for(int j=0;j<n;j++){
        currentsum += accounts[i][j];
      }
      if(currentsum > maxwealth){
        maxwealth = currentsum;
      }
    }
    System.out.println("Maximum wealth is : "+maxwealth);
  }
  
}
