package dsa_advance.arrays_2d;

import java.util.Arrays;

public class Q_20_Arrays_2d_PrintingAll_elements {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
            int n=arr.length;
            int m=arr[0].length;
            //Using Loops
            for(int i=0;i<n;i++){
                 for(int j=0;j<m;j++){
                    System.out.print(" "+arr[i][j]);
                 }
                 System.out.print("\n");
            }
    
            System.out.print("Using Inbuilt Function");

          System.out.print(Arrays.deepToString(arr));      
          //this prints 2D without the need to write the loops
          //Similar to Arrays.toString method
    
    }
    
}
