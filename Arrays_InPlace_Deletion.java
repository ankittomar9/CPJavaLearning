
    import java.util.Arrays;
import java.util.Scanner;

public class Arrays_InPlace_Deletion {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // index from where value is to be deleted
        int arr[] = {1, 2, 3, 5, 4, 6, 9, 7, 3, 1, 2, 4};
        int N = arr.length;
        
        // 1. Shift all elements from index n+1 to the left by one position
        // The loop runs up to N-2 because arr[i+1] will access the last element (N-1)
        for(int i = n; i < N - 1; i++){
            arr[i] = arr[i+1]; // Shift arr[n+1] into arr[n], arr[n+2] into arr[n+1], etc.
        }

        // 2. Overwrite the last element with a placeholder (0)
        arr[N - 1] = 0; 

        System.out.println("Original Array:\n " + Arrays.toString(arr));
        
        // Note: The logical size is N-1, but the physical size remains N.
        System.out.println("Array after In-Place Deletion\n (Logical Size " + (N-1) + "): \n" + Arrays.toString(arr));
    }
}

