

//import java.util.*;
import java.util.Scanner;

public class NumberPrinterReverse{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x=scn.nextInt();
            for (int i=x;i>=0;i--){
                System.out.println(" Reverse numbers are :: " +i);
            }
        }
    }
}
/*
   Reverse numbers are :: 5
 Reverse numbers are :: 4
 Reverse numbers are :: 3
 Reverse numbers are :: 2
 Reverse numbers are :: 1
 Reverse numbers are :: 0

 
 */