
import java.util.Scanner;

public class OddGameWL {
    public static void main(String args[]){
         Scanner scn=new Scanner(System.in);
         int x=scn.nextInt();
         
         OddGameWLFunction(x);
         
    }
   
    public static void OddGameWLFunction(int a){
        int i=0;
        while(i<=a){
            if(i%2==1){
                     System.out.print(" "+i);
            }
            i++;
           
        }
    }
    
}
