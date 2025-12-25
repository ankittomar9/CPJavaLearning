package BasicDSAImplemetations.Recursion;

public class Q_4_Factorial_of_Number {
    public static void main(String args[]){
        int n=5;
      int y=  Factorial(n);
        System.out.println("Factorial of N is : \n"+y);

    }

    public static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

       return Factorial(n-1)*n;


    }
    
}
