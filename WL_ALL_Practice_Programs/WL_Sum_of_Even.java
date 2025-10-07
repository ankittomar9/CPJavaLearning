package WL_ALL_Practice_Programs;
import java.util.Scanner;

public class WL_Sum_of_Even {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();

        int i=0; int sum=0;
        while(i<=a){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }

        System.out.println("The sum of Even Range : "+sum); //2 4 6 8 10 
    }
    
}

/*You are given a positive integer A. 
You have to print the sum of all even numbers in the range [1, A]. */