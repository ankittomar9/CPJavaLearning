package dsa_advance.array;

public class Q_9_Arrays_Minimum_Pick {
    public static void main(String args[]){
        /* given an array of integers nums of size N.
        Return the difference between the maximum among all even
            numbers of nums and the minimum among all odd numbers in nums. */

        int nums[]={5,17,100,1};
        int max_even=Integer.MIN_VALUE;
        int min_odd=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                max_even=nums[i];
            }
            if(nums[i]%2!=0){
                    min_odd=nums[i];
            }
        }
        int result=Math.abs(max_even)-Math.abs(min_odd);
              System.out.println("Even max : "+max_even);
              System.out.println("Odd min : "+min_odd);
              System.out.println("Difference is \n "+result);
           
    }
    
}
