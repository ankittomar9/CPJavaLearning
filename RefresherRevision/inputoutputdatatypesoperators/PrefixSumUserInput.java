package inputoutputdatatypesoperators;
import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Compute prefix sum array
        int[] prefixSum = computePrefixSum(array);

        // Display the result
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Prefix sum array: " + Arrays.toString(prefixSum));
        sc.close();
    }

    public static int[] computePrefixSum(int[] array) {
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0]; // Initialize the first element

        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        return prefixSum;
    }
    
}
