package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_19_Count_Subarray_Zero_Sum {
    public static void main(String args[]){
        int arr1[]={1,-1,1,-1};
        System.out.println("Original Array : \n" + Arrays.toString(arr1));
         System.out.println("Total Zero Sum Subarrays:\n " + countZeroSumSubarrays(arr1) + "\n");
 
        int arr2[]={0,0,0}; 
         System.out.println("Original Array : \n" + Arrays.toString(arr2));
        System.out.println("Total Zero Sum Subarrays:\n " + countZeroSumSubarrays(arr2) + "\n");
    }
    public static int countZeroSumSubarrays(int arr[]){
        if(arr==null || arr.length==0){return 0;}
        HashMap<Integer,Integer> map=new HashMap<>();
        long count=0;
        int currentSum=0;
        int mod=1000000007;
        map.put(0,1 );
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            
            if(map.containsKey(currentSum)){
                count=count+map.get(currentSum);
            }
            map.put(currentSum, map.getOrDefault(currentSum,0)+1);
        }
        return (int) (count%mod);
    }
}
