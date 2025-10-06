import java.util.Scanner;

public class WL_Easy_Power {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        long a=scn.nextLong();
        long b=scn.nextLong();
            long temp=b;
            if(b==0){
                System.out.print("1");
            }
        long result=1;
        while(b>0){
            result=result*a;

            b--;
        }

        System.out.print("Power of " +a+ " raised to " +temp+ " is : "+result);



    }
    
}

/*
You are given two integers A and B. You have to find the value of AB.

NOTE: The value of AB will always be less than or equal to 109.


Problem Constraints

1 <= A, B <= 1000
 * 
 */