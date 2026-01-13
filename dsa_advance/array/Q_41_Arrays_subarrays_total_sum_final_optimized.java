package dsa_advance.array;

public class Q_41_Arrays_subarrays_total_sum_final_optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        long total_Sum=0;
        // We use contribution technique to optimize it  read and think about it
        //long appearance=long(i+1)*(n-i);
        for(int i=0;i<arr.length;i++){

            // Step 1: Calculate how many subarrays include index 'i'
            // Formula: (Left choices) * (Right choices)
            
            long subarray_appearance= (long)(i+1)*(n-i);

            // Step 2: Add that element's total contribution
            total_Sum=total_Sum+(arr[i]*subarray_appearance);

     System.out.println("Element " + arr[i] + " appears in " + subarray_appearance + " subarrays.");
        }

        System.out.println("Total Sum is : " + total_Sum);
    }
    
}
