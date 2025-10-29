package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Unique2 {
    public static void main(String args[]){
        
        // 1. Initial unsorted list of elements (the input array A of N elements).
        ArrayList<Integer> numberList = new ArrayList<>(List.of(2, 4, 6, 8, 1, 2, 4, 6, 7, 1));
        
        // --- Core Logic Starts Here ---
        
        // 2. Sort the list. This enables the greedy approach.
        // Sorted: [1, 1, 2, 2, 4, 4, 6, 6, 7, 8]
        Collections.sort(numberList);
        
        System.out.println("Sorted List: " + numberList);
        
        // Variable to track the total number of increments (steps). Use long to prevent overflow.
        long totalSteps = 0;
        
        // This variable tracks the minimum unique value required for the CURRENT position.
        // It is initialized to the value of the first element.
        int requiredNextUnique = numberList.get(0);

        // 3. Iterate through the list starting from the second element (index 1).
        for(int i = 1; i < numberList.size(); i++){
            
            // Get the value of the current element being examined.
            int currentValue = numberList.get(i);
            
            // Case 1: No conflict. The currentValue is already greater than the required minimum.
            if(currentValue > requiredNextUnique){
                
                // This element is unique relative to the processed elements.
                // It now sets the new requirement for the next element.
                requiredNextUnique = currentValue; 
            }
            // Case 2: Conflict. The currentValue is a duplicate or too small (currentValue <= requiredNextUnique).
            else{
                
                // The minimum unique value this element MUST take is (previous_unique + 1).
                int desiredUniqueValue = requiredNextUnique + 1;
     
                // Calculate the steps needed: (New Value - Original Value)
                long stepsRequiredForCurrent = (long) (desiredUniqueValue - currentValue);
                
                // Add the steps to the total count.
                totalSteps += stepsRequiredForCurrent;
                
                // Crucially, update the element in the list to its new unique value.
                // This value will be used in the next iteration to set requiredNextUnique.
                numberList.set(i, desiredUniqueValue);
                
                // Set the new minimum unique value required for the *next* element to the one we just assigned.
                requiredNextUnique = desiredUniqueValue;

            }
        }
        
        System.out.println("Total Minimum Steps: " + totalSteps);
        System.out.println("Final Unique List: " + numberList);
    }
}