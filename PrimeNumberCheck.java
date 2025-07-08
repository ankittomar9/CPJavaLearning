import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        PrimeNumberCheckFunc(x);
    }
    public static void PrimeNumberCheckFunc(int x){
        int i=1;int count=0;
        while(i<=x){
            if(x%i==0){
                count++;
            }
            i++;
        }

        if(count==2){
            System.out.println("Given number is prime number ");
        }else 
          System.out.println("Given number is Not prime number ");
    }
    
}
