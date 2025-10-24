import java.util.ArrayList;
import java.util.List;

public class ArrayList_Diagonal_Matrix_Sum {
    public static void main(String args[]){
        List <List<Integer>> list1 =new ArrayList<>(List.of(

        List.of(1,2,3),
        List.of(4,5,6),
        List.of(7,8,9)
        )
     );
        int sum=0;

     System.out.println(list1);
   
        int matrixSize = list1.size(); // 3 for this 3x3 matrix

        System.out.println("Input Matrix: " + list1);

        // We only need ONE loop because for the main diagonal, the row index (i) 
        // and the column index (i) are the same (i = j).
        for(int i = 0; i < matrixSize; i++){
            
            // Correctly retrieve the element at position [i][i] (Main Diagonal)
            // list1.get(i) gets the row (inner list)
            // .get(i) gets the element from that inner list (the column)
            int element = list1.get(i).get(i);
            
            sum = sum + element;
            
            // Optional: Print the element being added for clarity
            System.out.println("Adding diagonal element at [" + i + "][" + i + "]: " + element);
        }

        System.out.println("---------------------------------");
        System.out.println("Total Main Diagonal Sum: " + sum);

    }
    
}
