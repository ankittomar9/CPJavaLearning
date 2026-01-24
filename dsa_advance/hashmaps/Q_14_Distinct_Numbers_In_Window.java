package dsa_advance.hashmaps;
import java.util.ArrayList;
import java.util.HashMap;
public class Q_14_Distinct_Numbers_In_Window {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 3};
        int k = 3;  
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size()); 
        
        for (int i=k; i<arr.length; i++) {
          
            int outgoing = arr[i - k];
            if (map.get(outgoing) == 1) {
                map.remove(outgoing); 
            } else {
                map.put(outgoing, map.get(outgoing) - 1);
            }         
            int incoming = arr[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);
                       
            result.add(map.size());
        }
        
        System.out.println("Distinct counts: " + result);
    }
}