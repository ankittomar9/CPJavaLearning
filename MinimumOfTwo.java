
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
            System.out.println("x is greater" +x);
        }
        else 
         System.out.println("x is greater" +y);
    }

    
}
