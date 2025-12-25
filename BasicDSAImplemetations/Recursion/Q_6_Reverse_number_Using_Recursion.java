package BasicDSAImplemetations.Recursion;

public class Q_6_Reverse_number_Using_Recursion {
    public static void main(String args[]){
        int n=1234;
        //Expected output=4321

        //System.out.println("Reverse Number is " );
               

    }

    public static void ReverseHelper(int n){
        if(n==0){
            return;
        }
       
       System.out.println(n+" ");
        n=n%10;
        ReverseHelper(n/10);
    }
    
}
