package dsa_advance.array;

public class Q_46_Longest_Subarray_with_at_most_k_zeroes {
    public static void main(String args[]){
        /*Problem: Given binary array (0s and 1s) and k, find longest subarray with at most k zeros.
        Example: [1,1,0,0,1,1,1,0,1], k=2 → longest = 7 ([1,1,0,0,1,1,1]) */
        int arr[]={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; int n=arr.length;
        int k=2;        int left=0; int max_Length=Integer.MIN_VALUE;
        int countZeroes=0;
            for(int right=0;right<n;right++){
                if(arr[right]==0){
                    countZeroes++;
                }
                while( countZeroes>k && left<=right){
                   if(arr[left]==0){
                      countZeroes--;
                   }
                  
                    left++;
                }
                
                max_Length=Math.max(max_Length, right-left+1);
            }
            if (max_Length == Integer.MIN_VALUE) {
                  System.out.println("No valid subarray == 0");
          } else {
              System.out.println("Longest subarray with at most " + k + " zeros: " + max_Length);
             }
    }
    
}
