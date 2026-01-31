package dsa_advance.bitmanipulation;

public class Q_1_1_Binary_Addition {
    public static void main(String args[]){
        String A="1010";  // 10
        String B="1011";  // 11
        //Expected output = 10+11 = 21 (10101) --(64-32-16-8-4-2-1)for conversion

        StringBuilder result=new StringBuilder(); 
        int i=A.length()-1;        int j=B.length()-1; int carry=0;

        while(i>=0 || j>=0 || carry==1){
            int sum=carry;

            if(i>=0){
                sum=sum+A.charAt(i)-'0';
            i--;
            }

            
            if(j>=0){
                sum=sum+B.charAt(j)-'0';
            j--;
            }

            int write=sum%2;

            result.append(write);
            
            carry=sum/2;
        }

        System.out.println("Binary Addition"+result.reverse().toString());

    }
    
}
