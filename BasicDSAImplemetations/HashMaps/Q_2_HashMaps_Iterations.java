package BasicDSAImplemetations.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Q_2_HashMaps_Iterations {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Aman", 95);
        map.put("Naman",74);
        map.put("Rohit",40);
        map.put("Mohit",91);

        //Traverse using keySet Method 1
           System.out.println("\nUsing KeySet to traverse HashMap\n");
        for(String key:map.keySet()){
            System.out.println("Key " + key+ " , Value : "+map.get(key));
        }

           //Traverse using entrySet Method 2
           System.out.println("\nUsing EntrySet to traverse HashMap\n");
           for(Map.Entry<String, Integer> entry: map.entrySet()){
             System.out.println("Key " + entry.getKey()+ " , Value : "+entry.getValue());
           }

    }
}
