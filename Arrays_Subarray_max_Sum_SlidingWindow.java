public class Arrays_Subarray_max_Sum_SlidingWindow {
    public static void main(String args[]){
         int nums[]={-3,4,-2,5,3,-2,8,2,-1,4};
        int k=5;
        SubarrayCalculatorUsingSlidingWindow(nums,k);

    }
    public static void SubarrayCalculatorUsingSlidingWindow(int nums[],int k){
        int n=nums.length; int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        ans=sum;

        int start=1;int end=k;
        while(end<n){
            sum=sum+nums[end]-nums[start-1];
        }
        if(sum>ans){
            ans=sum;
        }
          System.out.println("Subarray Sum from index "+start+" to "+end+" : " + sum);
        start++;end++   ;
    }
     System.out.println("----------------------------------------------");
        System.out.println("The Overall Maximum Subarray Sum is: " + ans);

}
