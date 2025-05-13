
import java.util.Scanner;

public class MultiplesOfANumber {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        
        MultiplesOfANumberFunc(x);


    }

    public static void MultiplesOfANumberFunc(int a){
        int i=0;
        while(i<=a){
            if(i%4==0){
                System.out.print(" "+i);

            }
            i++;
        }
    
    }

    
}
