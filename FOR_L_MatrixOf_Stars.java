import java.util.Scanner;

public class FOR_L_MatrixOf_Stars {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            int y=scn.nextInt();

            FOR_L_MatrixOf_Stars_Func(x,y);
        }

        public static void FOR_L_MatrixOf_Stars_Func(int n,int m){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }


        }

    }
    /*

Problem Description
Given two integers N and M as inputs, print a rectangle of N * M stars.
For example if N = 3, M = 4 then pattern will be like:

****
****
**** 

     */