package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_12_Sub_array_with_0_Sum {
    public static void main(String args[]){
        int arr[]={4,2,-3,1,6};
         System.out.println("Original Array :\n"+Arrays.toString(arr));
        subarrayWithZeroSumHelper(arr);
    }
    public static void subarrayWithZeroSumHelper(int arr[]){
        if(arr==null || arr.length==0){
           System.out.println("array is empty or null"); return;}
            boolean isFound=false;
           HashMap<Integer,Integer> map=new HashMap<>();
           int currentSum=0;
           for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            
            if(currentSum==0){
                isFound=true;
                System.out.println("Found subarray with 0 sum ending at index " + i);
                break;
            }
            if(map.containsKey(currentSum)){
                isFound=true;
                System.out.println("Found subarray with 0 sum between index : \n"
                    +(map.get(currentSum)+1) + " and  " +i);
            }
            map.put(currentSum, i);
        }
        if(!isFound){
             System.out.println("No subarray with 0 sum found");
        }
    }
}
