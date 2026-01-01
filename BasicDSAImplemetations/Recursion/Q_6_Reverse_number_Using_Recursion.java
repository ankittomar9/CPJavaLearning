package basicDSAImplemetations.Recursion;

public class Q_6_Reverse_number_Using_Recursion {
    public static void main(String args[]){
        int n=1234;
        //Expected output=4321

        System.out.println("Reverse Number is " );
        ReverseHelper(n);
               

    }

    public static void ReverseHelper(int n){
        if(n==0){
            return;
        }
         int extract=n%10;  //extract  
         System.out.print(extract+""); //Print
          // reduce and call again with reduce
         int reduce=n/10;
        ReverseHelper(reduce);  //call
    }
    
}
