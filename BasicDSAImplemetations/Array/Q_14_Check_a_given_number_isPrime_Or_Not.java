package BasicDSAImplemetations.Array;

public class Q_14_Check_a_given_number_isPrime_Or_Not {
    public static void main(String args[]){
        //A number is said to Be Prime if the number has eaxctly two factors
        // 1  2  3  5 7  11 13 19 
        int n=13;  //n=15
        isPrimeCheck(n);

    }
    public static void isPrimeCheck(int n){
        if(n<0){
            System.out.println("Negative Input is not allowed");
        }
        int factorsCount=1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                factorsCount++;
            }
        }
        if(factorsCount==2){
            System.out.println("Given Number is Prime : "+n);
        }else{
             System.out.println("Given Number is not Prime : ");
        }
    }
    
}
