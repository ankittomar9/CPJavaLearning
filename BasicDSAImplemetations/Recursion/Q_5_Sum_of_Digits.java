package basicDSAImplemetations.Recursion;

public class Q_5_Sum_of_Digits {
    public static void main(String args[]){
        int n=12345;
        // Expected output = 1+2+3+4+5=15
        int y=Sum_of_Digits(n);
        System.out.println("Sum of Digits is "+y);

    }
    public static int Sum_of_Digits(int n){
        if(n==0){
            return 0;
        }
        int lastDigit=n%10; //extract
         int reduce=n/10;//reduce
        
        return  lastDigit + Sum_of_Digits(reduce);

    }
    
}
