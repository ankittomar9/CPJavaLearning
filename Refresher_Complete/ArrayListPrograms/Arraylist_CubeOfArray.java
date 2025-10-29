package ArrayListPrograms;
import java.util.ArrayList;
import java.util.List;

public class Arraylist_CubeOfArray {
    public static void main(String args[]){
      List<Integer> list1 =new ArrayList<>(List.of(2,6,8,1));
       List<Integer> list2 =new ArrayList<>();
       System.out.println(list1);
       int cube=1;
       for(int i=0;i<list1.size();i++){
        cube=1;
        cube=cube*(list1.get(i)*list1.get(i)*list1.get(i));
         list2.add(cube);
       } 

      

       System.out.println(list2);
      
    
    }
    
}
