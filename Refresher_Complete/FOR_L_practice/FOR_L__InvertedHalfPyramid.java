package FOR_L_practice;
import java.util.Scanner;

public class FOR_L__InvertedHalfPyramid {

     public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int m=scn.nextInt();
        
        for(int i=1;i<=m;i++){
            for(int j=i;j<=m;j++){
                System.out.print("*");
               
                // if (j != i) {
    			// 	System.out.print(" ");
    			// }

                
            }
            System.out.println(" ");
        }
        
    
    
    
    }
    
}

/*
Problem Description

Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

****
***
**
*
 * 
 */