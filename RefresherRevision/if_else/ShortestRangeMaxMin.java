package if_else;

public class ShortestRangeMaxMin {
    public static void main(String args[]){
        int A[]={2,4,5,6,7,2,3};
        
            int n = A.length;
            int minVal = A[0];
            int maxVal = A[0];
            
            // Find the overall minimum and maximum
            for (int i = 1; i < n; i++) {
                if (A[i] < minVal) {
                    minVal = A[i];
                } else if (A[i] > maxVal) {
                    maxVal = A[i];
                }
            }
            
            // Edge case: All elements are equal
            if (minVal == maxVal) {
                System.out.println("All elements are equal");
            }
            
            int minPos = -1;
            int maxPos = -1;
            int minLength = n;
            
            // Traverse the array to find the smallest subarray length
            for (int i = 0; i < n; i++) {
                if (A[i] == minVal) {
                    minPos = i;
                    if (maxPos != -1) {
                        int currentLength = i - maxPos + 1;
                        if (currentLength < minLength) {
                            minLength = currentLength;
                        }
                    }
                }
                if (A[i] == maxVal) {
                    maxPos = i;
                    if (minPos != -1) {
                        int currentLength = i - minPos + 1;
                        if (currentLength < minLength) {
                            minLength = currentLength;
                        }
                    }
                }
            }
            
            System.out.println(" Range is  : " +minLength);

   
        }
    }


/*
 


 */