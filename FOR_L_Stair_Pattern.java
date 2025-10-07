import java.util.Scanner;

public class FOR_L_Stair_Pattern {
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

    
           FOR_L_Stair_Pattern_Func( x);
    
    
    }
    public static void FOR_L_Stair_Pattern_Func(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}


/*
Take an integer N as input, print the corresponding stair pattern for N.

For example if N = 4 then stair pattern will be like:

*
**
***
****



 */