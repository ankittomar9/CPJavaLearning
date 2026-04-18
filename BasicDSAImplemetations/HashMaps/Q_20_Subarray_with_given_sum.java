package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_20_Subarray_with_given_sum {
    public static void main(String args[]){
    int arr1[]={1,4,20,3,10,5}; int b1=33;
    System.out.println("Original Array : " + Arrays.toString(arr1) + "\nTarget: " + b1);
    int result1[]=findSubarray(arr1,b1);
    System.out.println("Subarray found at indices: \n" + Arrays.toString(result1) + "\n");
 
        int arr2[]={10,2,-2,-20,10}; int b2=-10;  
          System.out.println("Original Array : " + Arrays.toString(arr2) + "\nTarget: " + b2);
          int result2[]=findSubarray(arr2,b2);
        System.out.println("Subarray found at indices: \n" + Arrays.toString(result2) + "\n");
    }
    public static int[] findSubarray(int arr[],int target){
        if(arr==null || arr.length==0){ return new int[]{-1,1};}
    
    HashMap<Integer,Integer> map=new HashMap<>();
    int currentSum=0;
    for(int i=0;i<arr.length;i++){
        currentSum=currentSum+arr[i];

        if(currentSum==target){
            return new int[]{0,i};
        }
        int requiredPastSum=currentSum-target;

        if(map.containsKey(requiredPastSum)){
            int startIndex=map.get(requiredPastSum)+1;
            return  new int[]{startIndex,i};
        }
        if(!map.containsKey(currentSum)){
            map.put(currentSum, i);
        }
    }
    return new int[]{-1,1};
    }
}