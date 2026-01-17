package dsa_advance.array;

public class Q_45_Minimum_Subarray_Sum {
    public static void main(String args[]){
            /*Problem: Given array of positive integers and target,
             find the minimum length of a contiguous subarray whose sum is >= target. Return 0 if none.
            Example: [2,3,1,2,4,3], target=7 → min length 2 ([4,3]) 
            we need to find the minimu length subarray whose sum is >=target*/
                 int arr[]={2,3,1,2,4,3}; int n=arr.length; int target=7; 

                int left=0;int currentSum=0;int min_Length=Integer.MAX_VALUE;      
              
                for(int right=0;right<n;right++){

                    currentSum=currentSum+arr[right];

                 while(currentSum>=target ){

                        int current_length=right-left+1;

                    min_Length=Math.min(min_Length, current_length);

                    currentSum=currentSum-arr[left];
                    
                     left++;
                }
                 
                }
            
                if(min_Length == Integer.MAX_VALUE){
                        System.out.println("Result: 0");
                    } else {
                        System.out.println("Minimum Length is: " + min_Length);
        }
    }
    
}
