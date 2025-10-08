package FOR_L_practice;
import java.util.*;
public class FOR_L_CountFactors {
    public static void main(String[] args){

    Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        
        FOR_L_CountFactors_func(x);

    }
   public static void  FOR_L_CountFactors_func(int a){
    int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        System.out.println("The count of Factors are : "+count);


    }
    
}


/*
Using For Loop
 Problem Description

Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6

Problem Constraints

1 <= N <= 300
 
 */