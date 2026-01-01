package basicDSAImplemetations.Recursion;

public class Q_12_Power_Function_Recursion {
    public static void main(String args[]){
        int n=2;int a=10;
        // Recursive expression a^n=(a^n-1) * a;
        int result=PowerHelper(a,n);
        System.out.println("Power of a^n is : \n"+result);
    }

    public static int PowerHelper(int a,int n){
        if(n==0){
            return 1;
        }


        return PowerHelper(a,n-1)*a;
    }
    
}
