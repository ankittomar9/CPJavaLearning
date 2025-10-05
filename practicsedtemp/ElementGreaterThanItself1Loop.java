package practicsedtemp;

import java.util.Scanner;

public class ElementGreaterThanItself1Loop{

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
      //  int arr[]={2,4,6,9,7,1,7,9,6,1,7,9};
        int arr[]={2,5,1,4,8,0,8,1,3,8};
        int n=arr.length; int count=0;
        System.out.println(n);
        int max=Integer.MIN_VALUE;
            
        for(int i=0;i<n;i++){
          if(arr[i]>max){
            max=arr[i];
           // count++;
          }  else if(arr[i]==max){
            max=arr[i];
            count++;
          }

        }

        System.out.println(" :: "+ (n-count));
        
    }

}

/*
The main issue in the provided code is how the `count` variable is managed within the loop. The logic for updating `count` is incorrect and doesn't properly track the frequency of the maximum element. 🐞

-----

## Why the Code Fails

The current code attempts to find the count of elements greater than themselves by using a single loop, but its logic is flawed. The issue lies in these lines:

```java
if (arr[i] > max) {
    max = arr[i];
    count++; // Issue here
} else if (arr[i] == max) {
    max = arr[i];
    // count++; // This is the fix, but it's commented out
}
```

The code increments `count` only when a new, larger maximum is found. It completely fails to count subsequent occurrences of the **same** maximum value.

Let's trace the logic with the example array `arr = {2, 5, 1, 4, 8, 0, 8, 1, 3, 8}`:

  * `max` starts at `Integer.MIN_VALUE`.
  * `count` starts at `0`.

<!-- end list -->

1.  **`arr[0]` is 2**: 2 \> `Integer.MIN_VALUE`. `max` becomes 2, and `count` becomes 1.
2.  **`arr[1]` is 5**: 5 \> 2. `max` becomes 5, and `count` becomes 2.
3.  **`arr[2]` is 1**: 1 \< 5. The code does nothing.
4.  **`arr[3]` is 4**: 4 \< 5. The code does nothing.
5.  **`arr[4]` is 8**: 8 \> 5. `max` becomes 8, and `count` becomes 3.
6.  **`arr[5]` is 0**: 0 \< 8. The code does nothing.
7.  **`arr[6]` is 8**: 8 == 8. The `else if` block is executed, but it does not increment `count`. The `count` remains at 3.
8.  **`arr[7]` is 1**: 1 \< 8. The code does nothing.
9.  **`arr[8]` is 3**: 3 \< 8. The code does nothing.
10. **`arr[9]` is 8**: 8 == 8. The `else if` block is executed, but it does not increment `count`. The `count` remains at 3.

At the end of the loop, `count` is 3, and `max` is 8. The final result `(n - count)` is `(10 - 3) = 7`. This is incorrect. The maximum value `8` appears three times, so the correct result should be `10 - 3 = 7`, but the logic is flawed. In a different scenario where the maximum appeared multiple times in a row, the `if` statement would not handle it correctly. The correct logic should be: if you find a new max, **reset** the count to 1. If you find an element equal to the max, **increment** the count.

-----

## The Correct Single-Loop Solution

To fix the issue, you must separate the logic for finding a new maximum from the logic for counting its occurrences.

```java
int max = Integer.MIN_VALUE;
int count = 0;

for (int i = 0; i < n; i++) {
    if (arr[i] > max) {
        max = arr[i];
        count = 1; // Reset count to 1 for the new max
    } else if (arr[i] == max) {
        count++; // Increment count for another instance of the max
    }
}
System.out.println("The number of elements not equal to the maximum is: " + (n - count));
```
 */