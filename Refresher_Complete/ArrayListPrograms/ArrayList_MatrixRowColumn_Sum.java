package ArrayListPrograms;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_MatrixRowColumn_Sum {
    public static void main(String args[]){
        //Scanner scn=new Scanner(System.in);

    List<List<Integer>>list=new ArrayList<>(
        List.of(
            List.of(1,2,3),
            List.of(4,5,6,7),
            List.of(8)
        )
    );    
    // Revision the declaration 

    System.out.println("2D ArrayList Initialized:");
        System.out.println(list); 
        // Output: [[1, 2, 3], [4, 5, 6, 7], [8]]

        // Accessing an element (e.g., the '5' in the second row, index 1)
        int element = list.get(1).get(1);
        System.out.println("Element at [1][1]: " + element); // Output: 5
    }


}
