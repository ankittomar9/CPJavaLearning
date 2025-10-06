import java.util.Scanner;

public class WL_Multiplication_Table {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int x=scn.nextInt();

        int i=1;int j=10;
        int result=0;
        while(i<=j){
            result=x*i;

           
             System.out.println(+x+" * "+i+" = "+result);
              i++;
        }
    }
    
}

/*
Take a number A as input, print its multiplication table having the first 10 multiples.


Problem Constraints

1 <= A <= 1000
 */