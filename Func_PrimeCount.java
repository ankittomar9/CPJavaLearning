import java.util.Scanner;

public class Func_PrimeCount {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();

        Func_PrimeCount_Func(a);
    } 

    public static void Func_PrimeCount_Func(int x){
        int count=0;
        for(int i=1;i<=x;i++){
            int factors=0;
            for(int j=1;j<=i;j++){
                     if(i%j==0){
                factors++;
            }
            }
            if(factors==2)
        count++;
      }
       
        System.out.print(count);


    }
    
}
