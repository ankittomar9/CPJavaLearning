
import java.util.Scanner;


public class NumbersOfBills {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        double bill=scn.nextDouble();
        int notes=scn.nextInt();

        System.out.println(" The Bills are \n " +(int)(bill/notes));
    }
    
}
/*
 126.3
5

 The Bills are 
 25
 */