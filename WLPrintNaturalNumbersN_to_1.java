import java.util.Scanner;

public class WLPrintNaturalNumbersN_to_1 {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();  // 10
        
        WLPrintNaturalNumbers1_toN_Func( x);
    }
    public static void WLPrintNaturalNumbers1_toN_Func(int a){
        int i=a; int j=1;
        while(i>=j){   // 1>10   //10>1  // 1<10 
            System.out.print(" "+i);
          i--;  
        }

    }

}

/*
Write a program to print all Natural numbers from N to 1 where you have to take N as input from user
 */