package basicDSAImplemetations.Recursion;

public class Q_12_Power_Function_optimized {
    public static void main(String args[]){
        int a=10; int n=2;
        int result=PowerFunctionHelper(a,n);

        System.out.println("Result of " + a + "^" + n + " is: " + result);
    }

    public static int PowerFunctionHelper(int a,int n){

     // 1. BASE CASE: Anything to power 0 is 1
        if(n == 0){
            return 1;
        }

        // 2. RECURSIVE STEP: Divide & Conquer
        // Calculate the half-power ONCE.
        // Example: If n=10, we calculate 2^5.
        int halfPower = PowerFunctionHelper(a, n / 2);
        
        int halfPowerSq = halfPower * halfPower;

        // 3. COMBINE
        // Check if n is ODD
        if(n % 2 != 0) {
            // If odd, we need one extra 'a'
            return a * halfPowerSq;
        }
        
        // If even, just the squared value is enough
        return halfPowerSq;
    }

}
