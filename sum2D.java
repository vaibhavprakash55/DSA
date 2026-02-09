public class sum2D {
  public static void main(String[] args) {
    int[][] arr = {{4,1,5},{78,14,7},{78,99,77},{101,45,12}};
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        sum += arr[i][j];
      }
    }
    System.out.println(sum);
  }
  
}
