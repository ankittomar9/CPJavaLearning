package WL_ALL_Practice_Programs;
import java.util.Scanner;

public class WL_Palindromic_Integer {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        WL_Palindromic_Integer_func(n);
    }

    public static void WL_Palindromic_Integer_func(int a){
        int result=0; int original_a=a;
       
        while(a>0){   // a>0  // 343> 0

             int digit=a%10; // 343  -> 343%10= 34  3  
             result=(result*10)+digit;  // 3
            a=a/10;
            
        }
        // System.out.println(result);
        if(result==original_a){
                 System.out.println("given number is palindromic : " );
        }
       else {
         System.out.println("given number is not palindromic : " );
       }

    } 
    
}
