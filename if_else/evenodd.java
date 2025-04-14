package if_else;

import java.util.Scanner;

public class evenodd {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        if(x%2==0 ){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        scn.close();
    }
    
}


/*
 14 
 Even Number

 17
 Odd Number 

 */