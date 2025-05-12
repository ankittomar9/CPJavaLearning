
import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
       int z= PrintTheLastDigitFunc(x);


        System.out.println("Last  Element : " +z);

    }

    public static int PrintTheLastDigitFunc (int a){
           a=a%10;
        //     System.out.println(" Sout 1 : " +a);
        //    // a=a/10;
            int y=a;
        //   System.out.println(" Sout 2 : " +y);
            return y;
        
    } 
    
}
