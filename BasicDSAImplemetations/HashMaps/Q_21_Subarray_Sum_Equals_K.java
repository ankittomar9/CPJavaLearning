package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_21_Subarray_Sum_Equals_K {
    public static void main(String args[]){
        int arr1[]={1,1,1}; int k1=2;
        System.out.println("Original Array : " + Arrays.toString(arr1) + "\nTarget K: " + k1);
        System.out.println("Total Subarrays: " + subarraySum(arr1, k1) + "\n");

        int arr2[]={10,2,-2,-20,10}; int k2=-10;
         System.out.println("Original Array : " + Arrays.toString(arr2) + "\nTarget K: " + k2);
        System.out.println("Total Subarrays: " + subarraySum(arr2, k2) + "\n");
    }
    public static int subarraySum(int arr[],int k){
    if(arr==null || arr.length==0){System.out.println("Array is empty or null"); return 0;}
        
    HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;
            int currentSum=0;
        map.put(0,1);            
        
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
                int requiredPastSum=currentSum-k;
                if(map.containsKey(requiredPastSum)){
                    count=count+map.get(requiredPastSum);
                }
                map.put(currentSum, map.getOrDefault(currentSum,0)+1);
            }
        return count;
    }
}
