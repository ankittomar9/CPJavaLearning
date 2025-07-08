 import java.util.Scanner;
public class CountFactorsOptimize {
    public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            CountFactorsFunc(x);
    }
    public static void CountFactorsFunc(int x){
      
      if(x<=0){
        System.out.println("Enter a positive number to check factors");
        return;
    }
      
        int i=1;
        int count=0;

        while(i*i<=x){
            if(x%i==0){
                if(i*i==x)
               //  System.out.print(" "+i);
                count+=1;

            }else {
                count+=2;
            }
           // System.out.print(" "+i);
            i++;
           
        }
        System.out.println("\n"+count);
    }
    
}
   
    

