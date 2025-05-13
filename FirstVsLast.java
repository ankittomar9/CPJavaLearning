
import java.util.Scanner;

public class FirstVsLast {
    public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
    int t=scn.nextInt();
    int a=scn.nextInt();

    FirstVsLastFunc(t,a);
        
    }
    public static void FirstVsLastFunc(int t ,int x){
        while(t-- >0){
        int i=0;
        int first=0;int last=x%10;
        while(x>0){
            first=x%10;
        //    System.out.println(""+x);
            x=x/10;
          //  System.out.println(""+x);
          //  i++;
        }
          System.out.print(+first+ "  " +last);
         
          System.out.println("\n");
    }
    }
    
}


/*Then, for each test case, ask for input a number N and print the first and last digits of N.
 * 
 */