import java.util.Scanner;

public class NumberPrinter1WL {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        NumberPrinter1(x);

    }

    public static void NumberPrinter1(int n){
        int i=0;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
    
}
