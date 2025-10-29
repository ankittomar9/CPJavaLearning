package ArrayListPrograms;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Frequency_Count {
    public static void main(String args[]){
    List<Integer> list1 =new ArrayList<>(List.of(1,2,5,1,5,1));
    List<Integer> list2=new ArrayList<>();
        int count=0;
    System.out.println(list1);
    
        for(int i=0;i<list1.size();i++){
            count=0;
        for(int j=0;j<list1.size();j++){
            if(list1.get(i).equals(list1.get(j))){
                count++;
            }

        }
        list2.add(count);
    }

    System.out.println(list2);


    }   
    
}
