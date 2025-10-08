import java.util.Scanner;

public class Func_Even_number_sum {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
            Func_Even_number_sum_Func(n);

    }
    public static void  Func_Even_number_sum_Func(int n){
        int sum=0;
     for(int i=0;i<=n;i++){
        if(i%2==0)
        sum=sum+i;

     }
     System.out.println(sum);
    }
    
}
