package Arrays1D;
import java.util.Arrays;

public class Arrays_COPY_the_Array {
    public static void main(String args[]){
        int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

        System.out.print(Arrays.toString(arr));
          System.out.println("\n---------------------------");
        System.out.print(Arrays.toString(arr1));

              System.out.println("\n---------------------------\n");

        int arr2[]=Arrays.copyOf(arr, arr.length);
               System.out.print(Arrays.toString(arr2));

         System.out.println("\n---------------------------\n");

        int arr3[] = arr.clone();
        System.out.println("3. .clone(): " + Arrays.toString(arr3));
      
         System.out.println("\n---------------------------\n");
        // --- 4. System.arraycopy() (Fastest for Segment Copy) ---
        // Setup: Create the destination array first
        int arr4[] = new int[arr.length]; 
        
        // Copy: 
        // Source: arr
        // Start from source index: 0
        // Destination: arr4
        // Start from destination index: 0
        // Length: arr.length (copy everything)
        System.arraycopy(arr, 0, arr4, 0, arr.length);
        System.out.println("4. System.arraycopy(): " + Arrays.toString(arr4));

    }
    
}


/*
Copy array elements from 1 array to another

int arr3[] = arr.clone();
        System.out.println("3. .clone(): " + Arrays.toString(arr3));
        
        // --- 4. System.arraycopy() (Fastest for Segment Copy) ---
        // Setup: Create the destination array first
        int arr4[] = new int[arr.length]; 
        
        // Copy: 
        // Source: arr
        // Start from source index: 0
        // Destination: arr4
        // Start from destination index: 0
        // Length: arr.length (copy everything)
        System.arraycopy(arr, 0, arr4, 0, arr.length);
        System.out.println("4. System.arraycopy(): " + Arrays.toString(arr4));
 * 
 */