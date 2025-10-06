
import java.util.Scanner;

public class WL_sum_of_digits {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        WL_sum_of_digits_func(n);

    }


        public static void WL_sum_of_digits_func(int x){
            int sum=0;
            while(x>0){
                int digit=x%10;
                sum=sum+digit;
                x=x/10;
            }
            System.out.println(sum);
        }


    
}
