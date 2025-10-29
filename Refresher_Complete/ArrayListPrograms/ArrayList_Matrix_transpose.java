package ArrayListPrograms;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Matrix_transpose {
    public static void main(String args[]){

        List <List<Integer>> list1 =new ArrayList<>(List.of(

        List.of(1,2,3),
        List.of(4,5,6),
        List.of(7,8,9)
        )
     );
        List <List<Integer>> list2 =new ArrayList<>();
     System.out.println(list1);

     int R = list1.size();         // Number of original rows (3)
        int C = list1.get(0).size();  // Number of original columns (3)

        for (int j = 0; j < C; j++) {
            list2.add(new ArrayList<>()); // Add C empty inner lists (the new rows)
        }

     for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            int element = list1.get(i).get(j);
            list2.get(j).add(element);

     }
     }
     System.out.println(list2);

    }
    
}
