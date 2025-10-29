package ArrayListPrograms;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Multiples_of_each_element {
    public static void main(String args[]){

        // --- 1. Define Input Arrays A and B (1D lists as per problem description) ---
        // Input A (The Dividends)
        List<Integer> A = List.of(12, 5, 8, 24, 6, 15);
        
        // Input B (The Divisors, defines the rows of the result)
        List<Integer> B = List.of(4, 3, 5); 

        // NOTE: The 2D list declaration below is ignored as the problem uses 1D arrays A and B.
        // List <List<Integer>> list1 = new ArrayList<>(List.of(
        //     List.of(1,2,3), List.of(4,5,6), List.of(7,8,9)
        // ));
        
        // --- 2. Initialize the Result Matrix (2D ArrayList) ---
        // Outer ArrayList<Inner ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        System.out.println("A (Dividends): " + A);
        System.out.println("B (Divisors): " + B);

        // --- 3. Nested Loop Logic: Outer loop iterates over Divisors (B) ---
        // The outer loop runs B.size() times, once for each required row in the answer.
        for(int j = 0; j < B.size(); j++){
            
            // Get the current divisor from B
            int divisor = B.get(j);

            // Initialize the inner list (the current row of the result)
            ArrayList<Integer> resultRow = new ArrayList<>();
            
            // Inner loop iterates over the Dividends (A)
            for(int i = 0; i < A.size(); i++){
                
                int dividend = A.get(i);
                
                // Check the divisibility condition: A[i] % B[j] == 0
                // Added check for divisor != 0 just in case.
                if(divisor != 0 && dividend % divisor == 0){
                    
                    // If divisible, add the element from A to the current row
                    resultRow.add(dividend);
                }
            }
            
            // Add the completed row to the final answer matrix
            answer.add(resultRow);
        }

        // --- 4. Output ---
        System.out.println("\nFinal Result Matrix:");
        System.out.println(answer);
        
        /* Expected Output based on A=[12, 5, 8, 24, 6, 15] and B=[4, 3, 5]:
         * Row 0 (Divisor 4): [12, 8, 24]
         * Row 1 (Divisor 3): [12, 24, 6, 15]
         * Row 2 (Divisor 5): [5, 15]
         * Final: [[12, 8, 24], [12, 24, 6, 15], [5, 15]]
         */
    }
}