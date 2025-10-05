import java.util.Scanner;

public class WL_perfect_squares {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

            WL_perfect_squares_func(x);
    }
    public static void WL_perfect_squares_func( int a){
        int i=1;
        while(i<=a){
            if(i*i==a){
                System.out.print(" "+i);
            }
           
            
            
            i++;
        }

     }
}
