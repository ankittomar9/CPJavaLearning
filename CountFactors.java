import java.util.Scanner;

public class CountFactors {
    public static void main(String args[]){
            Scanner scn=new Scanner(System.in);

            int x=scn.nextInt();
            CountFactorsFunc(x);

    }

    public static void CountFactorsFunc(int x){
        int i=1;
        int count=0;

        while(i<=x){
            if(x%i==0){
                 System.out.print(" "+i);
                count++;

            }
           // System.out.print(" "+i);
            i++;
           
        }
        System.out.println("\n"+count);
    }
    
}
