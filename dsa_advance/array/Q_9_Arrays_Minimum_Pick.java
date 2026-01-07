package dsa_advance.array;

public class Q_9_Arrays_Minimum_Pick {
    public static void main(String args[]){
        /* given an array of integers nums of size N.
        Return the difference between the maximum among all even
            numbers of nums and the minimum among all odd numbers in nums. */

        long nums[]={5,17,100,1};
        long max_even=Long.MIN_VALUE;
        long min_odd=Long.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(nums[i]>max_even)
                max_even=nums[i];
            }
            if(nums[i]%2!=0){
                if(nums[i]<min_odd)
                    min_odd=nums[i];
            }
        }
        long result=Math.abs(max_even)-Math.abs(min_odd);
              System.out.println("Even max : "+max_even);
              System.out.println("Odd min : "+min_odd);
              System.out.println("Difference is \n "+result);
           
    }
    
}
