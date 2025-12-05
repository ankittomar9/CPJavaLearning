public class Arrays_Subarray_Minimum_Swaps_Required {
    public static void main(String args[]){
        int nums[]={1,12,10,3,14,10,5};
        int nums1[]={25,30,2,18,7,6,9,50,3};
        int num2[]={19,11,3,9,7,25,6,20,4};

        int B=8; //8  10  10 
        Minimum_Swaps_Required_Func(nums,B);
    }

  public static void Minimum_Swaps_Required_Func(int nums[],int B){
             int n=nums.length; int k=0; //k is length of subarray window
             //Finding the Length of subarray window
        for(int i=0;i<n;i++){
            if(nums[i]<=B){
                k++;
            }
        }
          System.out.println("Length of Subarray Window : "+k);

        // calculate the count > B for the first window
        int ans=Integer.MIN_VALUE; int count=0;

        for(int i=0;i<k;i++){
            if(nums[i]>B)
                count++;
        }
        ans=count;

        // Consider remaining Windows
        int start=1; int end=k;
        
        while(end<n){
           if(nums[end]>B){
            count++;
           }
           if(nums[start-1]>B){
            count--;
           }

           start++;end++;
        }
        System.out.println(ans);

    }
}
