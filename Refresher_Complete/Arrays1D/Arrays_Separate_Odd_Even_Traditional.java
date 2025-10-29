package Arrays1D;

import java.util.Arrays;


public class Arrays_Separate_Odd_Even_Traditional {
    
    public static void main(String args[]){
        int arr[] = {2, 3, 6, 7, 8, 2, 4, 5, 2, 3, 6};
        
        // --- PASS 1: COUNT (Determine the final size of the result arrays) ---
        int evenCount = 0;
        int oddCount = 0;
        
        // Use a traditional loop for counting
        for(int i = 0; i < arr.length; i++){
            // Check for even
            if(arr[i] % 2 == 0){
                evenCount++;
            } else {
                // Must be odd
                oddCount++;
            }
        }
        
        // --- INITIALIZATION ---
        // Create the result arrays with the exact required size
        int even_arr[] = new int[evenCount];
        int odd_arr[] = new int[oddCount];

        // --- PASS 2: FILTER & WRITE (Compaction) ---
        int evenIndex = 0; // Write pointer for even_arr
        int oddIndex = 0;  // Write pointer for odd_arr

        // Use a traditional loop for filtering and writing
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                // Write to the even array and advance the even pointer
                even_arr[evenIndex] = arr[i];
                evenIndex++; 
            } else {
                // Write to the odd array and advance the odd pointer
                odd_arr[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        // --- OUTPUT ---
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Compacted Even Array : " + Arrays.toString(even_arr));
        System.out.println("Compacted Odd Array : " + Arrays.toString(odd_arr));
    }
}

