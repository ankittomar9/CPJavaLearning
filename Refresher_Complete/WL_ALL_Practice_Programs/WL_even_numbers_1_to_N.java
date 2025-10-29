package WL_ALL_Practice_Programs;
import java.util.Scanner;

public class WL_even_numbers_1_to_N {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            WL_even_numbers_1_to_N_func(n);
        }
          public static void WL_even_numbers_1_to_N_func(int a){

        int i=1;
        while(i<=a){
            if(i%2==0){
                System.out.print(+i);
            }
            else{
                System.out.print(" ");
            }
            i++;
        }

    }
    
    
}


/*
Write a program to print all even numbers from 1 to N where you have to take N as input from the user.
Note: Use while-loop OR for-loop, according to session flow.

Note: You can use int(input()) for obtaining user input of number N.
 */