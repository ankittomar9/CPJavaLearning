package Arrays_Subarray;
public class Arrays_Subarray_Minimum_Swaps_Required {
    public static void main(String args[]){
        int nums[] = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        Minimum_Swaps_Required_Func(nums, B);
    }

    public static void Minimum_Swaps_Required_Func(int nums[], int B){
        int n = nums.length; 
        
        // --- 1. Determine Window Size (k) ---
        // k is the count of "good" elements (<= B).
        int k = 0; 
        for(int num : nums){
            if(num <= B){
                k++;
            }
        }
        
        if (k == 0) {
            System.out.println("No elements are <= " + B + ". Minimum Swaps: 0");
            return;
        }
        
        System.out.println("Original Array: " + java.util.Arrays.toString(nums));
        System.out.println("Threshold (B): " + B);
        System.out.println("Length of Subarray Window (k) : " + k); // k = 3
        
        // --- 2. Calculate "Bad" Count for the First Window ---
        // 'count' tracks the number of bad elements (> B) in the current window.
        int currentBadCount = 0;
        for(int i = 0; i < k; i++){
            if(nums[i] > B) {
                currentBadCount++;
            }
        }
        
        // 'minSwaps' is initialized to the count of the first window.
        // It tracks the minimum number of bad elements found across all windows.
        int minSwaps = currentBadCount; 
        
        // --- 3. Slide the Window and Update Minimum ---
        int start = 1;
        int end = k; 
        
        while(end < n){
            // a) Element Leaving (at index start - 1): Check if it was a BAD element
            if(nums[start - 1] > B){
                currentBadCount--;
            }

            // b) Element Entering (at index end): Check if it is a BAD element
            if(nums[end] > B){
                currentBadCount++;
            }
            
            // Update the overall minimum swaps found so far
            minSwaps = Math.min(minSwaps, currentBadCount);
            
            // Slide the window indices
            start++;
            end++;
        }
        
        System.out.println("The Overall Minimum Swaps Required is: " + minSwaps);
    }
}