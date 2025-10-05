
import java.util.Scanner;


public class WL_For_N_printmultiplesof4 {

        public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
                int n=scn.nextInt();

                WL_For_N_printmultiplesof4_func(n);

        }
        
            public static void   WL_For_N_printmultiplesof4_func(int a){

                int i=1;
                while(i<=a){
                    if(i%4==0){
                        System.out.print(" "+i);
                    }
                    // else{
                    //     System.out.print(" ");
                    // }
                    i++;
                }

             }




}
