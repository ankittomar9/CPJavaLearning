//import java.util.*;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x=scn.nextInt();
            System.out.println(" This is number from input file :: " +x);
        }
    }
}
