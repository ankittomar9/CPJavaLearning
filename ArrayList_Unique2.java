
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Unique2 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(List.of(2,4,6,8,1,2,4,6,7,1));
        Collections.sort(list);
        System.out.println(list);
        long total_steps_count=0;
        int step_req=list.get(0);

        for(int i=1;i<list.size();i++){
            int New_steps=list.get(i);
        
        if(New_steps>step_req){
           step_req=New_steps; 
        }
        else{
            int compare_steps=step_req+1;

            
            total_steps_count=total_steps+(desiredValue-current);
            list.set(i, desiredValue);
            required_nextUnique=desiredValue;

        }
        
        
        
        
        }


    }
    
}
