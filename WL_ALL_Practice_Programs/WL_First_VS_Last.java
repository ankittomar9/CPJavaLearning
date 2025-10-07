package WL_ALL_Practice_Programs;
import java.util.Scanner;

public class WL_First_VS_Last {
        public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
              int t=scn.nextInt();
            
          


     
            int first=0; int last=0;
                while(t>0){
                        int a=scn.nextInt();
                    last=a%10; // 

                        while(a>0) {
                            
                            first=a%10;
                            a=a/10;
                        }
                    


                     System.out.println(first + " " + last);        
                    t--;
                }


            }


    
}


/*
 Write a program that asks the user to input a number T, indicating the number of test cases.
Then, for each test case, ask for input a number N and print the first and last digits of N.
 */