package dsa_advance.hashmaps;

import java.util.HashMap;

public class Q_13_Check_pair_two_sum {
    public static void main(String args[]){
        int arr[]={8, 9, 1, -2, 4, 5, 11};
        int target=6;

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int needed = target - current;
            
            if (map.containsKey(needed)) {
                System.out.println("Pair found: " + current + " and " + needed);
                System.out.println("Indices: " + map.get(needed) + " and " + i);
                found = true;
                break; 
            }
            map.put(current, i);
        }
        if (!found) {
            System.out.println("No pair found");
        }

    }
    
}
