
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Unique {
    public static void main(String args[]){
     //  List<Integer> list=List.of(2 ,4,6,8,1,2,4,6,7,1);
       ArrayList<Integer>list=new ArrayList<>(List.of(2 ,4,6,8,1,2,4,6,7,1));

      //Sorting it 
      Collections.sort(list); 
      System.out.println(list);

      long total_steps=0;
      int required_nextUnique=list.get(0);

      for(int i=1;i<list.size();i++){
        int current=list.get(i);

        if(current>required_nextUnique){
          required_nextUnique=current;
        }
        else{
          int desiredValue=required_nextUnique+1;
          total_steps=total_steps+(desiredValue-current);
          list.set(i, desiredValue);
          required_nextUnique=desiredValue;
        } 
      }



       System.out.println(list);

        
    }
    
}


/*You are given an array A of N elements. You have to make all elements unique.
To do so, in one step you can increase any number by one.
Find the minimum number of steps. */