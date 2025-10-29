package Refresher_Complete.Arrays2D;
import java.util.Scanner;

public class Arrays2DPrintColByCol {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int mat[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        // row by row
        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //         System.out.println("");
        // }

        // column by colmun
         for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(mat[i][j]+" ");
            }
                System.out.println("");
        }

    }
    
}

/*3 
4
1 2 3 4
4 5 6 5
7 8 9 6

1 4 7 
2 5 8 
3 6 9 
4 5 6 


*/