package WL_ALL_Practice_Programs;
import java.util.*;
public class WL_odd_numbers_1_to_N {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        WL_odd_numbers_1_to_N(x);
    }

 
    public static void WL_odd_numbers_1_to_N(int n){
        int i=1;
        while( i<=n){
            if(i%2!=0){
                System.out.print(" "+i);
            }
            else{
    //           System.out.print(" Default");
            }
            i++;
        }
    }



}

/*
 Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

 */