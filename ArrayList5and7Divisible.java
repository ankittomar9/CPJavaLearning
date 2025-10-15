
import java.util.ArrayList;
import java.util.List;

public class ArrayList5and7Divisible {
    public static void main(String args[]){
        List<Integer>arr=new ArrayList<>();
         List<Integer>arr1=new ArrayList<>();
        
        arr.add(5);
         arr.add(7);
          arr.add(70);
           arr.add(50);    
            arr.add(35);    

            for(int i=0;i<arr.size();i++){
                if(i%7==0 || i%5==0){
                    arr1.add(i);
                }
            }

            System.out.println(arr1);
    }
    
}
