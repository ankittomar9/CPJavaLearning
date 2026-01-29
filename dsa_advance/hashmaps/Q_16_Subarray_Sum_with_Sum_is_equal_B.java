package dsa_advance.hashmaps;
import java.util.HashMap;
/*Problem Statement Given an array arr = {10, 2, -2, -20, 10} and a target sum B = -10.
 Find if there exists a continuous subarray that adds up to B. */
public class Q_16_Subarray_Sum_with_Sum_is_equal_B {
    public static void main(String args[]){
        int arr[]={10,2,-2,-20,10}; int B=-10;
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,-1);

            int currentSum=0; 
            boolean isFound=false;

            for(int i=0;i<arr.length;i++){
                currentSum=currentSum+arr[i];
                // CurrentSum - OldSum = B
                // OldSum = CurrentSum - B
                int needed_Old_Sum = currentSum-B;

                if(map.containsKey(needed_Old_Sum)){
                    System.out.println("Subarray found from Index " + 
                                   (map.get(needed_Old_Sum) + 1) + " to " + i);
                isFound = true;
                break;
                }
                map.put(currentSum, i);
            }

            if (!isFound) System.out.println("No subarray found");
    }
    
}
