import java.util.Scanner;

public class WLPrintNaturalNumbersN_to_1 {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        
        WLPrintNaturalNumbers1_toN_Func( x);
    }
    public static void WLPrintNaturalNumbers1_toN_Func(int a){
        int i=1;
        while(i<a){   // 1>10   //10>1  // 1<10 
            System.out.println(" "+i);
          i--;  
        }

    }

}
