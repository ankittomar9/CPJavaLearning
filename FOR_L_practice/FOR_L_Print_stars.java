package FOR_L_practice;
import java.util.Scanner;

public class FOR_L_Print_stars {
        public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();

            PrintStars(x);
        
        }
        
            public static void PrintStars(int n){
                for(int i=1;i<=n;i++){
                    System.out.print("*");
                }
            }

}


/*
Given an integer N, print N stars in a single line.

For example if N = 5 then pattern will be like:

*****

 */