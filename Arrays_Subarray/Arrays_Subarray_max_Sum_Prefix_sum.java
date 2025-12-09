package Arrays_Subarray;
import java.util.Arrays;

public class Arrays_Subarray_max_Sum_Prefix_sum {
    public static void main(String args[]){
         int nums[]={-3,4,-2,5,3,-2,8,2,-1,4};
        int k=5;
        SubarrayCalculatorUsingPrefixSum(nums,k);
    }
   public static void SubarrayCalculatorUsingPrefixSum (int[] nums,int k){
    int start=0;int end=k-1;int ans=Integer.MIN_VALUE;
        int n=nums.length;
        //calculate prefix sum
        int[] pf_sum=new int[n];
        // int pf_sum=0;
        // for(int i=0;i<n;i++){
        //     pf_sum=pf_sum+nums[i];
        //     pf[i]=pf_sum;
        // }
         pf_sum[0]=nums[0];
        for(int i=1;i<n;i++){
            pf_sum[i]=pf_sum[i-1]+nums[i];
        }
        
        System.out.println(Arrays.toString(pf_sum));
        while(end<n){
            int sum=0;
            if(start==0){
                sum=pf_sum[end];
            }else{
                sum=pf_sum[end]-pf_sum[start-1];
                        }
             System.out.println("Subarray Sum from index "+start+" to "+end+" : " + sum);
            if(sum>ans){
                    ans=sum;                }
          start++;end++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("The Overall Maximum Subarray Sum is: " + ans);

 }
    
}
