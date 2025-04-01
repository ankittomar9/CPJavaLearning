package if_else;

import java.util.*;

public class FizzBuzz {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }else if(n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.print("Buzz");
        }
            scn.close();
    }
    
}

/*
 3 -- fizz
 5 -- buzz

 15 --FizzBuzz
 
 */