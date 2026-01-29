package dsa_advance.hashmaps;
import java.util.HashMap;
/*Problem Statement Given arr = {1, 2, 3} and K = 3.
 Find the total number of continuous subarrays whose sum equals K */
public class Q_17_Subarray_Sum_Equals_K {
    public static void main(String args[]){
      int arr[] = {1, 1, 1}; // Try {1, 2, 3} as well
        int k=2;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int currentSum=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];

            int removeSum =currentSum-k;

            if (map.containsKey(removeSum)) {
                count =count + map.get(removeSum);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        
        }
        System.out.println("Total Subarrays with sum " + k + ": " + count);
    }
    
}
