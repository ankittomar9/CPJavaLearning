package RefresherRevision.if_else_revision;

import java.util.Scanner;

public class MinOfThree {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        
        MinOfThreeFunc(a,b,c);
    }

    public static void MinOfThreeFunc(int x,int y,int z){

        if(x<=y && x<=z){
            System.out.println("x is smaller "+x);
        }
        else  if(y<=x && y<=z){
            System.out.println("y is smaller "+y);
        }
         else  if(z<=x && z<=y){
            System.out.println("z is smaller "+z);
        }
        else 
         System.out.println("Invalid input ");
        
    }
    
}


/*
 * Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C.

Problem Constraints


1 <= A <= 1000000

1 <= B <= 1000000

1 <= C <= 1000000



Input Format


First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.


 */