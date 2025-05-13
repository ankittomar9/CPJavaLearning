package RefresherRevision.if_else_revision;

import java.util.Scanner;

public class whichTriangle {
    public static void main(String[] args){
    
    Scanner scn=new Scanner(System.in);
      int a=scn.nextInt();
      int b=scn.nextInt();
      int c=scn.nextInt();

        findtriangle(a,b,c);
    
    }

    public static void findtriangle(int x,int y,int z){
       if ((x == y && x != z) || (x == z && x != y) || (y == z && y != x)){
            System.out.println("Isoceles Traingle");
        }
        else  if(x!=y && y!=z && x!=z ){
            System.out.println("Scalene Traingle");
        }
         else {
            System.out.println("Equilateral Traingle");
        }
    }

}

/*

 Problem Constraints
1 <= A <= 100000

1 <= B <= 100000

1 <= C <= 100000

Input: 
 I/P:1 : 5 6 7 
 Output: Scalene

 I/P:1 :30 30 30
 Output:Equilateral

 Exp: Not required

 */