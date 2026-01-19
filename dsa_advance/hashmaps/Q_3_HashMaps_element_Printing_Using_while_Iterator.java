package dsa_advance.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q_3_HashMaps_element_Printing_Using_while_Iterator {
    public static void main(String args[]){
         HashMap<String,Integer> map=new HashMap<>();
        //Unlike Arrays or Lists, you cannot simply say for (int i=0...).
        //  A Map is not an ordered list; it's a bag of keys
      map.put("Charlie",90);  map.put("Alice",86);map.put("Bob",86);
        map.put("Daniel",95);

            System.out.println("Iterating using While Loop (Iterator) \n");
            //Step 1 Declare Iterator
            Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();

            while(it.hasNext()){
                Map.Entry<String,Integer> entry=it.next();
                
                   System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

    }
    
}
/*The only reason to use this while loop / Iterator method 
nowadays is if you need to remove items while looping.
Enhanced For-Loop: Throws ConcurrentModificationException if you try to map.remove() inside it.
Iterator (While Loop): Safe to use it.remove(). */