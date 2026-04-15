package BasicDSAImplemetations.HashMaps;
import java.util.HashMap;
public class Q_3_HashMap_Add_Remove {
    public static void main(String args[]){
      
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30); // removed
        hm.put(4,40);
        hm.put(5,50);
        
        hm.put(null,99);
        hm.put(null,100);

        System.out.println("Original Map : \n"+hm);
        hm.remove(3);
        hm.remove(null);
        
       // hm.remove(50); -> Fails, because 50 is not a Key.
        // hm.removeValue(50); -> Doesn't exist in Java API.
        System.out.println("Removed a key value pair \n"+hm);

        // using values collection
        hm.values().remove(50); 
        System.out.println("After removing Value 50 (The Backdoor method): \n" + hm);


    }
}
