package dsa_advance.arrays_2d;

import java.util.Arrays;

public class Q_26_Arrays_2D_Matrix_Transpose {
    public static void main(String args[]){
         int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
         int n=arr.length;            int m=arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }
        System.out.println("2DArray Transpose : \n "+Arrays.deepToString(arr));

            System.out.println("\n 2D Array Transpose:");
        for(int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
