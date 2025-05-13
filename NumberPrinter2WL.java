import java.util.Scanner;

public class NumberPrinter2WL {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        NumberPrinter2Func(a);

    }
    public static void NumberPrinter2Func(int x){
        int i=0;
        while(x>=i){
            System.out.print(" " +x);
            x--;
        }
    }
    
}

/*
 * 
 Write a program to print all Natural numbers from N to 1 where you have to take N as input from user
 1 <= N <= 10000000
Input Format
A single line representing N

Output Format
N space separated integers from N to 1.

Example Input
Input 1:
5
 
5 4 3 2 1
 */