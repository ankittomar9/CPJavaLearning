import java.util.Scanner;

public class OddEven {
    public static void main (String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();

       OddEvenFunc(a);
       
    }

    public static void OddEvenFunc(int a){
        if(a%2==0){
           System.out.println("Even : "+a);
        }
        else 
       System.out.println("Odd : " +a);
    }
   
    
}

/*

 Problem Constraints
1 <= N <= 10000 

Input: 
 I/P:1 : 4
 Output: Even

 I/P:1 :3
 Output:Odd

 Exp: Not required

 */