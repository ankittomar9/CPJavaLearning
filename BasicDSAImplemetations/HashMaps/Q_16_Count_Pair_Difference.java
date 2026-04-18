package BasicDSAImplemetations.HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class Q_16_Count_Pair_Difference {
    public static void main(String args[]){
        int arr1[]={1,5,3,4,2};int b1=2;
  System.out.println("Original Array : " + Arrays.toString(arr1) + "\nTarget Difference:" + b1);
 System.out.println("Total Pairs: " + countPairDifference(arr1, b1) + "\n");

        int arr2[]={1,1,1,2,2}; int b2=0;
     System.out.println("Original Array : " + Arrays.toString(arr2) + "\nTarget Difference: " + b2);
        System.out.println("Total Pairs: " + countPairDifference(arr2, b2) + "\n");
    }
    public static int countPairDifference(int arr[],int b){
        if(arr==null || arr.length<2){ return 0;}

        HashMap<Integer,Integer> map=new HashMap<>();
        long count=0;     b=Math.abs(b);   

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int complement1 =current-b;
            count=count+map.getOrDefault(complement1,0);

            if(b!=0){
                int complement2=current+b;
                count=(count+map.getOrDefault(complement2,0));
            }
            map.put(current, map.getOrDefault(current,0)+1);
        }
        return (int)count;
    }
}
