package RefresherRevision.practicsedtemp;
import java.util.Arrays;

public class ReversetheArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int i=0;int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
    
}

/* For reversing an array with two pointers, using `while (i < j)` is the correct and most efficient approach. Using `while (i <= j)` will work, but it performs an unnecessary swap when `i` and `j` cross or meet in the middle of the array, which is a minor but real inefficiency.

***

## Comparison of `i < j` and `i <= j`

### `while (i < j)`

This is the standard and more efficient condition for reversing an array using two pointers.

* **How it works:** The loop continues as long as the left pointer `i` is strictly less than the right pointer `j`. This ensures that you only swap pairs of elements from the ends of the array. The loop stops exactly when the pointers meet in the middle or cross each other. This prevents a redundant swap of the middle element with itself in an odd-length array. 

* **Example:** For `arr = {1, 2, 3, 4, 5}` (length 5), the pointers start at `i=0` and `j=4`.
    * **Swap (1, 5)**: `i=0`, `j=4`. `i++`, `j--`.
    * **Swap (2, 4)**: `i=1`, `j=3`. `i++`, `j--`.
    * Now `i=2`, `j=2`. The condition `i < j` is false, so the loop terminates. The middle element `3` is not swapped, which is correct since swapping it with itself has no effect.

### `while (i <= j)`

This condition also works but is slightly less efficient.

* **How it works:** The loop continues as long as `i` is less than or equal to `j`.
* **Impact:** When the array has an **odd number of elements**, `i` and `j` will eventually meet at the middle element. The loop will perform one final iteration where it swaps the middle element with itself.
    * **Example:** For `arr = {1, 2, 3, 4, 5}`:
        * The last iteration is when `i=2` and `j=2`. The code will execute `temp = arr[2]`, `arr[2] = arr[2]`, and `arr[2] = temp`. This is a redundant operation.
* **Result:** The final reversed array will be correct, but the code performs one more swap operation than necessary.

In summary, for array reversal, **`while (i < j)` is the better choice** because it is more precise and avoids an unnecessary operation on odd-length arrays, making it slightly more performant.*/