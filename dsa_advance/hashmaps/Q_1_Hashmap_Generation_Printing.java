package dsa_advance.hashmaps;

import java.util.HashMap;

public class Q_1_Hashmap_Generation_Printing {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        //Step  1: Storing the key value pairs in Hashmap
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 90);
        map.put(null,10); // think about this

          //Step  2: Accessing and printing 1 by 1 the key value pairs in Hashmap
        System.out.println("Value at this key "+map.get("Alice"));
         System.out.println("Value at this key "+map.get("Bob"));
          System.out.println("Value at this key "+map.get("Charlie"));
          System.out.println("Value at this key "+map.get(null));

          //Step 3 : Instead of writing 3 print statements  we can  do this in a loop
            //Check in next answer 

    }
    
}
