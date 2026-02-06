// find union of two sorted array

import java.util.Scanner;
public class union {
  public static void main(String[] args) {
    int arr1[] = {1,2,2,3,4};
    int arr2[] = {2,3,5,6};
    int i=0, j=0;
    
    while(i<arr1.length && i<arr2.length){
      if(arr1[i]<arr2[j]){
        System.out.println(arr1[i] + " ");
        i++;
      }else if(arr1[i]>arr2[j]){
        System.out.println(arr2[j] + " ");
        j++;
      }else{
        System.out.println(arr1[i]+ " ");
        i++;
        j++;
      }
      while(i<arr1.length){
        System.out.println(arr1[i]+ " ");
        i++;
      }
      while(j<arr2.length){
        System.out.println(arr2[j]+ " ");
        j++;
      }
    }
  }
}
