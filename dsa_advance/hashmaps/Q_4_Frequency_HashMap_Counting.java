package dsa_advance.hashmaps;
import java.util.HashMap;
public class Q_4_Frequency_HashMap_Counting {
    public static void main(String args[]){
         int arr[]={10,20,20,10,10,5,10,20};
          // output // 10->4 times  20->3 times 5->1 time  
        
          HashMap<Integer,Integer> frequencyMap=new HashMap<>();
          
          for(int variable:arr){
            if(frequencyMap.containsKey(variable)){
                frequencyMap.put(variable, frequencyMap.get(variable)+1);
            }else{
                frequencyMap.put(variable, 1);
            }


             /* There is also a shorter way  of writing above code*/
        //   frequencyMap.put(variable, frequencyMap.getOrDefault(variable, 0)+1);
          }

          System.out.println("Frequency Counts:");
          for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " appears " + frequencyMap.get(key) + " times");
        }
         
    }
    
}
