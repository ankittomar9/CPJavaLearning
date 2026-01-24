package dsa_advance.array;
import java.util.Arrays;
public class Q_51_Continuous_Sum_Query {
    public static void main(String args[]) {
        int A = 5; 
        // Matrix: {Start, End, Value}
        int[][] B = {
            {1, 2, 10},  // Query 1: Add 10 to range [1, 2]
            {2, 3, 20}   // Query 2: Add 20 to range [2, 3]
        };       
        int[] result = Solve(A, B);
       
             System.out.println("Final Pot Values: " + Arrays.toString(result));
    }
    public static int[] Solve(int A, int[][] B) {
        int[] arr = new int[A];

        for (int i = 0; i < B.length; i++) {
            // B[i] query row , B[i][0] startIndex L,
            // B[i][1] end Index R ,
            // B[i][2] is the value (P) 
            int L = B[i][0];
            int R = B[i][1];
            int P = B[i][2];

            int startIndex = L-1;
            int stopIndex = R;

            arr[startIndex] = arr[startIndex]+P;

            if (stopIndex < A) {
                arr[stopIndex]=arr[stopIndex]-P;
            }
        }

        for (int i=1; i<A; i++) {
            arr[i]=arr[i-1] + arr[i];
        }
        return arr;
    }
}