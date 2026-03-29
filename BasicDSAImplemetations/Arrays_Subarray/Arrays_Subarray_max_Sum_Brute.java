package Arrays_Subarray;
public class Arrays_Subarray_max_Sum_Brute {
    public static void main(String args[]){
        int nums[]={-3,4,-2,5,3,-2,8,2,-1,4};
        int k=5;
        SubarrayCalculator(nums,k);

    }

    public static void SubarrayCalculator(int nums[],int k){
        int n=nums.length; int start=0;
        int end=k-1; int ans=Integer.MIN_VALUE;
            while(end<n){
                int sum=0;
            for(int i=start;i<=end;i++){
                sum=sum+nums[i];
                }
                
       System.out.println("Subarray Sum from index "+start+" to "+end+" : " + sum);
           if(sum>ans){
                    ans=sum;
                }
          start++;end++;

        }
        System.out.println("----------------------------------------------");
        System.out.println("The Overall Maximum Subarray Sum is: " + ans);

    }
}
    

