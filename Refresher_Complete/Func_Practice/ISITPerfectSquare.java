package Func_Practice;

import java.util.Scanner;

public class ISITPerfectSquare {
    public static void main(String args[]){
    Scanner scn=new Scanner(System.in);

     int n=scn.nextInt();
        ISITPerfectSquare_func( n);

    }
        // 4*4=16 
    public  static void ISITPerfectSquare_func(int x){
         boolean isPerfectSquare = false; 
        for(int i=1;i*i<=x;i++){
            if(i*i==x){
               // System.out.println("Number is perfect square");
               isPerfectSquare=true;
                break;
            }
        }
        // 4. Use the flag to decide which message to print
        if (isPerfectSquare) {
            System.out.println("Number is perfect square");
        } else {
            System.out.println("Number is Not perfect square");

    }
    
    }
}



/*
Problem Description

You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.

A perfect square is an integer that is the square of an integer. For example 16 is perfect square as it is the square of an integer 4 (42 = 16)

 
 * 
 */