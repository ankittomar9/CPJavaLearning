
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String args[]){
    
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();

            MaxOfThreeFunc(x,y,z);
    
    }

        public static void MaxOfThreeFunc(int a,int b,int c){

            if(a>b && a>c){
                System.out.println("a is greater : "+a);
            }
            else if(b>a && b>c){
                System.out.println("b is greater : "+b);
            }            
            else if(c>b && c>a){
                System.out.println("c is greater : "+c);
            }
        }
    
    
}


/*

 Problem Constraints
1 <= A <= 1000000
1 <= B <= 1000000
1 <= C <= 1000000

Input: 
First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.

 Output: 

 I/P:1 :
 Output:

 Exp: Not required

 */