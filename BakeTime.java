
import java.util.Scanner;

public class BakeTime {

    public static void  main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int BakeTime=40;
        System.out.println("The Bake time is : "+(BakeTime-x));
        
    }
    
}

/*
 Problem Constraints

0 <= N <= 40

The Bake time is : 24

 
 */