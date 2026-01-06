package BasicDSAImplemetations.Recursion;

public class Q_2_Print_1_to_N_numbers {
    public static void main(String args[]){
        int n=5;
        System.out.println("--- Printing 1 to N ---");
         One_to_N_Print(n);
    }

    public static void One_to_N_Print(int n){
        if(n==0){
            return;
        }
        One_to_N_Print(n-1);
        System.out.println(n+" ");
    }
    
}
