package FOR_L_practice;

import java.util.Scanner;

public class FOR_L_prime_number {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        FOR_L_prime_number_Func(n);

    }

    public static void FOR_L_prime_number_Func(int a){
        // if(a==0){
        //     System.out.print("Not Prime nor anything");
        // }
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("Given number is Prime number");
        }else{
            System.out.print("Given number is Not a Prime number");
        }
        
    }
}

/*
Take an integer A as input, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
 */