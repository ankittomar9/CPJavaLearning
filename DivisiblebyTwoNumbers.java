
import java.util.Scanner;

public class DivisiblebyTwoNumbers {
    
    public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            DivisiblebyTwoNumbersFunc(x);

    }

    public static void DivisiblebyTwoNumbersFunc(int n){

            if(n%5==0 && n%11==0){
                System.out.println(+n+ "is Number is Divisible : ");
            }
            else 
                  System.out.println(" is Not Divisible by 5 and 11 " );

    }
}

/*/
Problem Description

Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.


Problem Constraints

1 <= A <= 109
*/