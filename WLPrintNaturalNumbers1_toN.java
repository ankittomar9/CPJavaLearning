import java.util.*;
public class WLPrintNaturalNumbers1_toN {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        WLPrintNaturalNumbers1_toN_Func(  n);
    }
     public static void  WLPrintNaturalNumbers1_toN_Func(int a){

        int i=1;
        while(i<=a){
            System.out.print(" "+i);
            i++;
         }

        }

    
}


/*
Write a program that takes a positive integer N as input
 from the user and prints all natural numbers from 1 to N, with each number followed by a space 
 (including the last number).
  */