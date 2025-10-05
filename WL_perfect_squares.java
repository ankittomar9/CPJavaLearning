import java.util.Scanner;

public class WL_perfect_squares {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

            WL_perfect_squares_func(x);
    }
    public static void WL_perfect_squares_func( int a){
        int i=1;
        while(i*i<=a){
           
                System.out.print(i*i+" ");   
            i++;
        }

     }
}

/*
 * 
Take an input of a number A from the user. Print all perfect squares less than or equal to A.
Note - Perfect squares are integers whose square root is an integer. (For Example: 16 is perfect square as √16 = 4, or 42 = 16)


 */