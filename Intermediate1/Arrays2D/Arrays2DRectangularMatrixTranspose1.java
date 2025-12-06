package Arrays2D;

import java.util.Arrays;

public class Arrays2DRectangularMatrixTranspose1 {
    public static void main(String args[]){
            int arr[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12}};
             Arrays2DRectangularMatrixTransposeFunc(arr);
    }

    public static void Arrays2DRectangularMatrixTransposeFunc(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        if(n==0 || m==0){
            System.out.println("Result: []");
            return;
        }

        int resultant[][]=new int [m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                resultant[j][i]=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(resultant));

    }
    
}
