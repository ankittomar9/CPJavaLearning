package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_15_Count_Pair_Sum {
    public static void main(String args[]){
        int arr1[]={3,5,1,2};int b1=8;
        System.out.println("Original Array : " + Arrays.toString(arr1) + "\nTarget: " + b1);
        System.out.println("Total Pairs: " + countPairSum(arr1, b1) + "\n");

        int arr2[]={1,2,1,2}; int b2=3;
        System.out.println("Original Array : " + Arrays.toString(arr2) + "\nTarget: " + b2);
        System.out.println("Total Pairs: " + countPairSum(arr2, b2) + "\n");
    }
    public static int countPairSum(int arr[],int b){
        if(arr==null || arr.length<2){ return 0;}

        HashMap<Integer,Integer> map=new HashMap<>();
        long count=0;         int mod=1000000007;

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int complement =b-current;

            if(map.containsKey(complement)){
                count=(count+map.get(complement))%mod;
            }
            map.put(current, map.getOrDefault(current,0)+1);
        }
        return (int)count;
    }
}
