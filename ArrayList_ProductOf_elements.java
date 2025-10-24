import java.util.ArrayList;
import java.util.List;

public class ArrayList_ProductOf_elements {
    public static void main(String args[]){
        List<Integer> list2=new ArrayList<>(List.of(1,2,7,6,3,4,6,7,1,8,2,4));
         List<Integer> list1=new ArrayList<>(List.of(3,4,2));
        System.out.println(list1);

        double product=1;
        for(int i=0;i<list1.size();i++){
            product=product*(list1.get(i));
        }

  System.out.println(product);
    
    
    }

    
}
