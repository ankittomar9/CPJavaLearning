package BinarySearch;

public class BinarySearchSqrt {
    public static void main(String args[]){
        long x=32; // worked for 2 4 8 16 not for 32 but worked for 64
        if(x<0){
            System.out.println("Negative Number doesn't allowed " );
        }
        if(x==0 || x==1){
            System.out.println("Square root of x is : " + x);
            return;
        }


        long low=1; long high=x;
        long ans=1;
        while(low<=high){
            long mid=low+(high-low)/2;
            long val=mid*mid;
            
            if(val==x){
                System.out.println("Square root of x is : "+mid);
               return;
            }

            else if(val<x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }    

        }
        System.out.println("Square root of x is : " + ans);

    }
    
}
