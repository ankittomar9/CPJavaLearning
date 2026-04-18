package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_18_Longest_Subarray_Zero_Sum {
    public static void main(String args[]){
        int arr1[]={15-2,2,-8,1,7,10,23};
    System.out.println("Original Array : \n" + Arrays.toString(arr1));
         System.out.println("Longest Zero Sum Subarray Length:\n " + getLongestZeroSum(arr1) + "\n");
 
        int arr2[]={1,2,3}; 
         System.out.println("Original Array : \n" + Arrays.toString(arr2));
        System.out.println("Longest Zero Sum Subarray Length:\n " + getLongestZeroSum(arr2) + "\n");
    }
    public static int getLongestZeroSum(int arr[]){
        if(arr==null || arr.length==0){ return 0;     }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int currentSum=0; int maxLength=0;
    
        for(int i=0; i<arr.length;i++){
            currentSum=currentSum+arr[i];

            if(currentSum==0){
                maxLength=Math.max(maxLength, i+1);
            }
            if(map.containsKey(currentSum)){
                int length=i-map.get(currentSum);
                maxLength=Math.max(maxLength, length);
            }
            else{
                map.put(currentSum,i);
            }
        }
        return maxLength;
    }

}
