package basicDSAImplemetations.Recursion;

public class Q_3_Sum_of_natural_numbers {
    public static void main(String args[]){
        int n=10; 
       int y= Calculate_Sum_Helper(n);
        System.out.println("Sum of N natural numbers is : "+y);
    }

    public static int Calculate_Sum_Helper(int x){
        if(x==1){
            return 1;
        }
         return Calculate_Sum_Helper((x-1))+x;                

    }
    
}
