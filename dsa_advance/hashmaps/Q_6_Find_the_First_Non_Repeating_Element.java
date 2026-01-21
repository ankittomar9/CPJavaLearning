package dsa_advance.hashmaps;
import java.util.HashMap;
public class Q_6_Find_the_First_Non_Repeating_Element  {
    public static void main(String args[]){
      int arr[]={9,4,9,6,7,4} ;
      boolean isFound=false;
      HashMap<Integer,Integer> map=new HashMap<>();

      for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
          map.put(arr[i], map.get(arr[i]) + 1);
        }else{
          map.put(arr[i],1);
        }
      }
       System.out.println("Frequency Map: " + map);

      for(int i=0;i<arr.length;i++){
           if (map.get(arr[i]) == 1){
      
        System.out.println("First non-repeating element is: " + arr[i]);
           isFound=true;
          break;
        }
      }
      if(!isFound){
         System.out.println("No first non repeating elements");
      }
    }
  }
