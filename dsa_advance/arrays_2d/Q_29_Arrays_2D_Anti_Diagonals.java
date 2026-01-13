package dsa_advance.arrays_2d;
import java.util.Arrays;
public class Q_29_Arrays_2D_Anti_Diagonals {
    public static void main(String args[]){
        //This is for Square Matrix //Marking for Revision
       int arr[][] = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
     int n=arr.length;int m=arr[0].length;
     
     int[][] result=new int[2*n-1][n];
    int rowRes=0;

      for(int c=0;c<n;c++){
        int startRow=0;int startCol=c;
        int colRes=0;
        while(startRow<n && startCol>=0){
            result[rowRes][colRes]=arr[startRow][startCol];
            startRow++;
            startCol--;
            colRes++;
        }
        rowRes++;
    }              

     for(int r=1;r<n;r++){
        int startRow=r;int startCol=n-1;
        int colRes=0;

        while(startRow<n && startCol>=0){
            result[rowRes][colRes]=arr[startRow][startCol];
            startRow++;
            startCol--;
            colRes++;
        }
        rowRes++;
    }              

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(result));

    }
}
