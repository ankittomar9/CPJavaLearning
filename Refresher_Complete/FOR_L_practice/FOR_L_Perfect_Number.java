package Refresher_Complete.FOR_L_practice;
import java.util.*;
public class FOR_L_Perfect_Number {
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        for(int j=1;j<=t;j++){

        int n=scn.nextInt();
        int sum=0;

        for(int i=1;i<=n-1;i++){
            if(n%i==0){
                sum=sum+i;
                
            }
        }
        if(n==sum){
                 System.out.println("Given number is perfect number");
        }else{
              System.out.println("Given number is NOT perfect number");
        }

    }
}
    
}

/*
Given the Number of Test Cases as T,
For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). 
A positive proper divisor divides a number without leaving any remainder.
 */