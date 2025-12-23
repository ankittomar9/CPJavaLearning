package BasicDSAImplemetations.HashMaps;

import java.util.HashMap;

public class HashMapAddRemovePrint {
    public static void main(String args[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30); // removed
        hm.put(4,40);
        hm.put(5,50);

        hm.remove(3);
       // hm.remove(hm.values(50)); Not Allowed
        System.out.println("Removed a key value pair \n"+hm);
        

    }
    
}
