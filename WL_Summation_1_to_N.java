import java.util.Scanner;

public class WL_Summation_1_to_N {
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        
    WL_Summation_1_to_N_func(x);
    }
    public static void WL_Summation_1_to_N_func(int a){
        int sum=0;
        int i=1;
        while(i<=a){
            sum=sum+i;
        i++;
        }
        System.out.print("The sum from 1 to  " + a +" is :  "+sum);
    }


    
}


/*
 * 
 * 
 * 
 */