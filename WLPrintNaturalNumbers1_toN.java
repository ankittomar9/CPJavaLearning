import java.util.*;
public class WLPrintNaturalNumbers1_toN {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        WLPrintNaturalNumbers1_toN_Func(  n);
    }
     public static void  WLPrintNaturalNumbers1_toN_Func(int a){

        int i=1;
        while(i<=a){
            System.out.println(" "+i);
            i++;
         }

        }

    
}
