import java.util.Scanner;

public class FOR_L_Print_Primes {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();

        for(int i=1;i<=x;i++){
            int result=0;
            for(int j=1;j<=x;j++){
                if(i%j==0){
                result++;
            }
     }
            if(result==2)
            System.out.println(" "+i);
        }


    }
    
}
