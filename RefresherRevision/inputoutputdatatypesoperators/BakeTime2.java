package inputoutputdatatypesoperators;

import java.util.Scanner;

public class BakeTime2 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int layer=2;
        layer=layer*x;

        System.out.println("The Bake time is :" +layer);

    }
    
}

/*
 Example Input

Input:-
16


Example Output

Output:-
32


 */