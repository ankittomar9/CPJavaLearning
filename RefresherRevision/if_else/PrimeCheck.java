package if_else;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int count=0;
        int N=scn.nextInt();

        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                if(i!=N/i){
                    count+=2;
                }else count +=1;
            }
        }
        if(count==2){
            System.out.println("Given number is prime number  : ");
        }else  System.out.println("Given number is Not a prime number : ");

    }

    }
    /*
    Check whether number is rpime or not 
        Condition(Check factors)
    20 not prime
    17 Prime number
     */