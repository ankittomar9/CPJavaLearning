package dsa_advance.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Q_2_HashMaps_Iterations {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        //Unlike Arrays or Lists, you cannot simply say for (int i=0...).
        //  A Map is not an ordered list; it's a bag of keys
      map.put("Charlie",90);  map.put("Alice",86);map.put("Bob",86);
        map.put("Daniel",95);

        //Method 1 : Using keySet() Printing like key value pair
        System.out.println(" Iterating using KeySet \n");
        for(String key:map.keySet()){
        System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Method 2: Using entrySet() - Efficient for large maps
          System.out.println(" Iterating using EntrySet \n");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        /*No, you cannot use a traditional for(int i = 0; i < n; i++) loop directly. 
        Why for(int i=0...) fails 
        Arrays/Lists are "Ordered Lines": They have index 0, index 1, index 2.
        You can ask for "the item at index i".
        HashMaps are "Unordered Bags": A HashMap uses a hash function to scatter data around.
        There is no concept of "Item #0" or "Item #1". There is only "Key X" and "Key Y".
        If you tried map.get(0), the map would look for a Key that is the integer 0.
        It would not give you the "first" item added. */

    }
    
}
