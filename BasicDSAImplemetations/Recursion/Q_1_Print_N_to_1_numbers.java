package BasicDSAImplemetations.Recursion;

public class Q_1_Print_N_to_1_numbers {
    public static void main(String args[]){
        int n=5;
        System.out.println("--- Printing N to 1 ---");
        printNto1(n);
        

    }

    public static void printNto1(int n){
        if(n==0) // base case    
            return ;

        System.out.println(n+" ");
        printNto1(n-1);

    }

    
}
