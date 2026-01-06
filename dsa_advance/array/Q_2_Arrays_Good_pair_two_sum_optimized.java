package dsa_advance.array;
import java.util.HashMap;

public class Q_2_Arrays_Good_pair_two_sum_optimized {
    public static void main(String args[]){
        int nums[]={1,2,3,4,4,5};        int target=7;
    // we Optimize this with Hashmap
    // arr[i]+arr[j]==target and i!=j 
    // so this also true arr[j]=target-arr[i]
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int required=target-current; // arr[j]=target-arr[i]

            if(map.containsKey(required)){
                System.out.println("Pair Found : [ "+ required +" , "+current+" ]" );
            }

            map.put(current,i);
        }
        

    }
    
}
