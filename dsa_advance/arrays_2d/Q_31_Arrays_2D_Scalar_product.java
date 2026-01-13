package dsa_advance.arrays_2d;

import java.util.Arrays;

public class Q_31_Arrays_2D_Scalar_product {
    public static void main(String args[]){
        //You are given a matrix arr and and an integer k,
        //  you have to perform scalar multiplication of matrix arr with an integer k.

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int k=2;
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=arr[i][j]*k;
            }
        }
        
        System.out.println("K multiplied in matrix with every element \n");
        System.out.println(Arrays.deepToString(arr));
    }
    
}
