package BasicDSAImplemetations.Recursion;

public class Q_6_Reverse_number_Using_Recursion_v2 {
    public static void main(String args[]){
        long n=12345;
         System.out.println("Original number : "+n);
        //expected output : 54321
        long result = reverse_Helper(n,0);
        System.out.println("Reversed number : "+result);

    }

    public static long reverse_Helper(long n,long currentReverse){
        if(n==0){
            return currentReverse;
        }
        long extract=n%10;
        long newReverse=(currentReverse*10)+extract;
        long reduce=n/10;
        
        return reverse_Helper(reduce, newReverse); 
    }
    
}
