

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
