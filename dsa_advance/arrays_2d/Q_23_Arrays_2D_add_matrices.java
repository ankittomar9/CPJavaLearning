package dsa_advance.arrays_2d;

import java.util.Arrays;

public class Q_23_Arrays_2D_add_matrices {
    public static void main(String args[]){
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
          int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
            int n=arr1.length; int m=arr1[0].length;
          //Note you can only add two matrices if they are of same dimesnions
      //Have time ask question what if dimensions are not same
          int resultant_mat[][]=new int[n][m];
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                resultant_mat[i][j]=arr1[i][j]+arr2[i][j];
            }
          }
          System.out.println("Matrix Sum");
          System.out.println(Arrays.deepToString(resultant_mat));
   
        }
    
}
