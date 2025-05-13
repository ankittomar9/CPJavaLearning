package RefresherRevision.if_else_revision;

import java.util.Scanner;

public class MinimumOfTwo {
    public static void main(String args[]){

        Scanner scn =new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();

       MinimuOfTwoNumbers(a,b);


    }

    public static void MinimuOfTwoNumbers(int x,int y){
        if(x>y){
            System.out.println("x is greater : " +x);
        }
        else 
         System.out.println("y is greater " +y);
    }

    
}

/*

 Problem Constraints
1 <= A <= 1000000
1 <= B <= 1000000


Input: 
 I/P:1 :First line is a single integer A. 5 
        Second line is a single integer B. 2
 Output:  A is greater



 Exp: Not required

 */