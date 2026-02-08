package BasicDSAImplemetations.Recursion;

public class Q_10_Fibonacci_Series {
    public static void main(String args[]){
        int n=7;  //Output  1 1 2 3 5 8 13 21 
        FibonaaciHelper(n);
        
        for(int i=0;i<=n;i++){
              System.out.print(  FibonaaciHelper(i)+" ");
        }

    }
    public static int FibonaaciHelper(int n){
        if(n==0 || n==1){
            return n;
        }
        
      
        return FibonaaciHelper(n-1)+FibonaaciHelper(n-2);
    }
    
}
