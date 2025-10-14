package Arrays1D;
import java.util.Arrays;

 public class Arrays_Negative_number_rm_zeros {
     public static void main(String args[]){
        int arr[] = {5, 1, -5, 2, -8, -4 ,4 ,-1 ,0 ,-8 ,-1};
        
        // PASS 1: Count the negative numbers (Determine the final size)
        int negativeCount = 0;
        for(int i = 0; i < arr.length; i++){ // Traditional 'for' loop for counting
            if(arr[i] < 0) {
                negativeCount++;
            }
        }
        
        // Initialize the final compacted array
        int arr_negatives[] = new int[negativeCount];

        // PASS 2: Filter and Write (Two-Pointer System)
        int writeIndex = 0; // The 'j' or write pointer
        
        for(int i = 0; i < arr.length; i++){ // Traditional 'for' loop for filtering
            // Check if the element is negative
            if(arr[i] < 0){
                arr_negatives[writeIndex] = arr[i]; 
                writeIndex++; // ONLY advance the write pointer for negative numbers
            }
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Compacted Negatives: " + Arrays.toString(arr_negatives));
    }
}



