package RefresherRevision.if_else_revision;

import java.util.Scanner;

public class AnglesOfValidTriangle {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
    
            ValidAnglesOfTriangleFunc(a,b,c);
    
    
    }

    public static void ValidAnglesOfTriangleFunc(int x,int y,int z){
        if(x+y+z==180){
            System.out.println("Its a valid triangle");

        }
        else 
         System.out.println("Its not a valid triangle");
    }
    
}
/*You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.


A triangle is valid if sum of its angles equals to 180.

NOTE: You have to take the input of 3 sides of triangle from the user.


Problem Constraints

1 <= A, B, C <= 180
irst line of the input contains an integer A.


Second line of the input contains an integer B.

Third line of the input contains an integer C.


*/
