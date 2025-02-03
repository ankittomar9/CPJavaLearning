//import java.util.*;
import java.util.Scanner;

public class NumberPrinter{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x=scn.nextInt();
            for(int i=0;i<x;i++){
                
                System.out.println(" This is number from input file :: " +i);
            }
         
        }
    }
}
