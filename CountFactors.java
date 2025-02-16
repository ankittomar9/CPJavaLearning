
import java.util.Scanner;

public class CountFactors {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int count=0;
        int range=scn.nextInt();

        for(int i=1;i<=range;i++){

            if(range%i==0){
               
                count++;
                //System.out.println(" Count of Factors are "+count);
            }
           
        }
        System.out.println(" Count of Factors are "+count);
    }
}
