
import java.util.Scanner;

public class PrintPerfectSquares {
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();

        PrintPerfectSquaresFunc(a);

    }

   public static void  PrintPerfectSquaresFunc(int x){
        int i=1;
    while(i*i<=x){
        
        //if(i*i==x)
        System.out.print(" " + i*i);
        i++;
    }

    }
    
}
