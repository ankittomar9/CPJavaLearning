
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int a=scn.nextInt();
        FizzBuzzPrint(a);

    }

    public static void FizzBuzzPrint(int n){
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3==0){
             System.out.println("Fizz");
        }
        else if(n%5==0){
             System.out.println("Buzz");
        }
    }
    
}
