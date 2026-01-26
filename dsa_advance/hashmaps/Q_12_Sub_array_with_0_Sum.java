package dsa_advance.hashmaps;
import java.util.HashMap;
public class Q_12_Sub_array_with_0_Sum {
    public static void main(String args[]){
      int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

          HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;        int maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentSum =currentSum+ arr[i];
            
            if (currentSum == 0) {
                maxLength = i + 1;
            }
            if (map.containsKey(currentSum)) {
                int previousIndex = map.get(currentSum);
                int len = i - previousIndex;
                
                if (len > maxLength) {
                    maxLength = len;
                }
            } else {
                map.put(currentSum, i);
            }
        }
        System.out.println("Longest Subarray Length: " + maxLength);
        }
    
}
