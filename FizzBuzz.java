
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int a=scn.nextInt();
        FizzBuzzPrint(a);

    }

    public static void FizzBuzzPrint(int n){
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3==0){
             System.out.println("Fizz");
        }
        else if(n%5==0){
             System.out.println("Buzz");
        }
    }
    
}
/*
 * 
 Write a program that takes in a number N as input and does the following:

if N is a multiple of 3, print Fizz
if N is a multiple of 5, print Buzz
if N is a multiple of both 3 and 5, print FizzBuzz
 */