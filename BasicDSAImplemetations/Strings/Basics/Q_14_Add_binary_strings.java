package BasicDSAImplemetations.Strings.Basics;

public class Q_14_Add_binary_strings {
    public static void main(String args[]){
            String A="110";String B="10";

        int i=A.length()-1; int j=B.length()-1;
        int carry=0;

        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0 || carry==1){
            int sum=0;
            if(i>=0){
                // Get digit from A (handle if A is shorter)
                sum=sum+A.charAt(i)-'0'; // Converts '1' to 1
                i--;
            }
            // Get digit from B
            if(j>=0){
                sum=sum+B.charAt(j)-'0';
                j--;
            }

               sum=sum+carry;

               // Compute new carry and result bit
            carry=sum/2;  // 1+1=2 -> carry 1. 1+0=1 -> carry 0.
             int write=sum%2; //// 2%2=0 (write 0). 3%2=1 (write 1).
               sb.append(write);     
        }   

       // Result is backwards (LSB to MSB), so reverse it
        System.out.println("Sum: " + sb.reverse().toString());
    }
    
}
