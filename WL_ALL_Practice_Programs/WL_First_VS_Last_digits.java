package WL_ALL_Practice_Programs;
import java.util.Scanner;

public class WL_First_VS_Last_digits {
        public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
                     int last =0;int first=0;
                int x=scn.nextInt();   
                last=x%10; // this gives the last digit  428%10 = 8 

                while(x>10){
                    first=x/10;
                    x=x%10;
                    
                }
    
            System.out.print(first+"   "+last);   

    
            }   
}


/*
 
 for input a number N and print the first and last digits of N.
 */