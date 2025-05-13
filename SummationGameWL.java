import java.util.Scanner;

public class SummationGameWL {
    public static void main(String args[]){
            Scanner scn=new Scanner(System.in); 
            
                int n=scn.nextInt();
                    SummationGameWLFunc(n);
            
            
      
        }
                  public static void   SummationGameWLFunc(int x){
                    int sum=0;
                    int i=0;
                    while(i<=x){
                        sum+=i;
                        i++;
                    }
                    System.out.print(sum);

          } 
        }     

/* Problem Description

Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
Problem Constraints
1 <= N <= 1000
Input Format
A single line representing N
Output Format
A single integer showing sum of all Natural numbers from 1 to N
Example Input
Input 1:
5
Input 2:
10
Example Output
Output 1:
15
Output 2:
55*/