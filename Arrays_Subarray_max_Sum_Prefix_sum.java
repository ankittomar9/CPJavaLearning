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
        int[] pf=new int[n];
        int pf_sum=0;
        for(int i=0;i<n;i++){
            pf_sum=pf_sum+nums[i];
            pf[i]=pf_sum;
        }
        System.out.println(Arrays.toString(pf));
        while(end<n){
            int sum=0;
            if(start==0){
                sum=pf[end];
            }else{
                sum=pf[end]-pf[start-1];
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
