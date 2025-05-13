import java.util.Scanner;

public class floorA_divideB {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt(); 
        int y=scn.nextInt();

            floorA_divideBfunc(x,y);

    }

   public static void floorA_divideBfunc(int a,int b){
          //  int result=a/b;
             int result = Math.floorDiv(a, b);
            System.out.print("Floor Division : "+result );


   }
}

/*Given two numbers A and B. Print the floor of A/B.

Problem Constraints
1 <= A, B <= 104

Input Format

There are two input lines
The first line has a single integer A.
The second line has a single integer B. */