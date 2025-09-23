import java.util.Scanner;

public class PerfectSquareCalculate {
    public static void main(String args[]){

        Scanner scn =new Scanner(System.in);
        int x=scn.nextInt();
        PerfectSquareCalculateFunc(x);
    }
 public static void PerfectSquareCalculateFunc(int x){
        int i=0;
            while(i<=x){
                if(i*i==x)
                  System.out.print("Perfect Square number : "+i);
                i++;
            }
          
    }
    
}
