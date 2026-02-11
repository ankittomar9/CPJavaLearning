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
            System.out.println("Negative Input is not allowed");
        }
        long sum=0;int original_number=0;

        for(int i=1;i<=n;i++){
             int extract=n%10;
                sum=sum+extract*10;
             int reduce=n/10;
        }
        
        if (sum == original_number) {
            System.out.println(original_number + " is an Armstrong Number.");
        } else {
            System.out.println(original_number + " is NOT an Armstrong Number.");
        }
    }
    
}
