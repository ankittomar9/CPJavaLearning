package basicDSAImplemetations.BinarySearch;

public class BinarySearch {
    public static void main(String args[]){
       int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int k=8;
        BinarySearchFunc(nums,k);    }

    public static void BinarySearchFunc(int nums[],int target){
        int n=nums.length; int low=0;int high=n-1;
         boolean isFound=false;

        while(low<=high){
            int mid=low+(high-low)/2;

           if(nums[mid]==target){
            System.out.println("tagret found at  : "+mid);
            isFound=true;
                break;
           }
           
           else if(nums[mid]<target){
           low=mid+1;
           }
           else{
            high=mid-1;
           }

        }
        if(isFound==false)
        System.out.println("Target Not Found" );
    }    
}
