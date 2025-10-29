package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5and7Divisible {
    public static void main(String args[]){
    //    List<Integer>arr=new ArrayList<>();
         List<Integer>arr1=new ArrayList<>();
          List<Integer> arr = List.of(5, 7, 70, 50, 35); 
        
        // arr.add(5);
        //  arr.add(7);
        //   arr.add(70);
        //    arr.add(50);    
        //     arr.add(35);    

            for(int i=0;i<arr.size();i++){
                int val=arr.get(i);
              //  if(val%7==0 || val%5==0){
                 if(val%7==0 && val%5==0){
                    arr1.add(val);
                }
            }

            System.out.println(arr1);
    }
    
}
