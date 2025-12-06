import java.util.Arrays;

public class Arrays_Rotation_Matrix {

    public static int[][] solve(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        
        // 1. Initialize the result matrix: M rows (for each rotation) x N columns (array length)
        int[][] resultMatrix = new int[M][N];
        
        // 2. Iterate through each rotation count in array B
        for (int i = 0; i < M; i++) {
            int k = B[i];
            
            // Normalize k for circularity
            // R = Effective Left Rotation amount
            int R = k % N;
            
            // 3. Map elements to the current row (i) of the result matrix
            for (int j = 0; j < N; j++) {
                
                // The element that belongs at the NEW index j 
                // is found at the ORIGINAL index (R + j) % N
                
                // Current element's original position:
                int original_index = (R + j) % N;
                
                // Assign element from original array A to the current row (i) of the result matrix
                resultMatrix[i][j] = A[original_index];
            }
        }
        
        return resultMatrix;
    }

    public static void main(String args[]) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 3};
        
        int[][] rotatedMatrix = solve(A, B);
        
        System.out.println("Original Array A: " + Arrays.toString(A));
        System.out.println("Rotation Counts B: " + Arrays.toString(B));
        System.out.println("\n--- Resulting Rotation Matrix ---");
        
        // Print the result matrix row by row
        for (int i = 0; i < rotatedMatrix.length; i++) {
            System.out.println("Rotation k=" + B[i] + ": " + Arrays.toString(rotatedMatrix[i]));
        }
    }
}