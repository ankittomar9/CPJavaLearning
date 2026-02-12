package BasicDSAImplemetations.Array;
public class Q_16_Calculate_Armstrong_number {
    public static void main(String args[]){
        /*A number is an Armstrong Number if the sum of its own digits, 
        each raised to the power of the number of digits, equals the number itself. */
        int n=153;
        isNumberArmstrongChecker(n);
    }
    public static void isNumberArmstrongChecker(int n){
        if(n<0){
            System.out.println("Negative Input is not allowed"); return;    }
           int sum=0;int original_number=n;
        // We need the count of digits to sum them properly 
        int digitsCount=0;           int temp=n;
         while(temp>0){
            digitsCount++;
            temp=temp/10;
         }   
        while(n>0){
            int lastDigit=n%10;
            int powerProduct=1;
            int i=0;
            while(i<digitsCount){
                powerProduct=powerProduct * lastDigit;
                i++;
            }
                sum = sum + powerProduct;
                n = n / 10;
        }        
        if (sum == original_number) {
            System.out.println(original_number + " is an Armstrong Number.");
        } else {
            System.out.println(original_number + " is NOT an Armstrong Number.");
        }
    }    
}
