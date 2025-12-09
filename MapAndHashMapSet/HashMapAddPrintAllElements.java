package MapAndHashMapSet;

import java.util.HashMap;
import java.util.Map; // Import Map for Map.entry and Map.ofEntries

public class HashMapAddPrintAllElements {
    public static void main(String args[]){
       //Traditional HashMap
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        hm.put(4,40);
        hm.put(5,50);

        System.out.println("HashMap :\n "+hm);


        // Using Map.ofEntries to initialize with multiple key-value pairs (Java 9+)
        // This creates an immutable Map, which is then passed to the HashMap constructor to make it mutable.
        HashMap<Integer,Integer> hm1 = new HashMap<>(Map.ofEntries(
            Map.entry(10, 2),
            Map.entry(11, 22),
            Map.entry(12, 32)
        ));
        // If you were on Java 8 or older, or preferred individual adds, you would do:
        // HashMap<Integer,Integer> hm1 = new HashMap<>();
        // hm1.put(10, 2);
        // hm1.put(11, 22);
        // hm1.put(12, 32);

        System.out.println("HashMap hm1 :\n "+hm1); // Add a print statement for hm1
    }
    
}
