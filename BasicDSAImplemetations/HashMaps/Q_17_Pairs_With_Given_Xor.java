package BasicDSAImplemetations.HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class Q_17_Pairs_With_Given_Xor {
  public static void main(String args[]){
    int arr1[]={5,4,10,15,7,6};int b1=3;
  System.out.println("Original Array : " + Arrays.toString(arr1) + "\nTarget XOR:" + b1);
 System.out.println("Total Pairs: " + solveXorPair(arr1, b1) + "\n");
 
        int arr2[]={3,6,8,10,15,50}; int b2=5;  // 3^6=5 10^15=5
     System.out.println("Original Array : " + Arrays.toString(arr2) + "\nTarget XOR: " + b2);
        System.out.println("Total Pairs: " + solveXorPair(arr2, b2) + "\n");
  }  
  public static int solveXorPair(int arr[],int b){
    if(arr==null || arr.length<2){return 0;}
    HashMap<Integer,Integer> map=new HashMap<>();
    long count=0;

    for(int i=0;i<arr.length;i++){
        int current=arr[i];
        int complement=arr[i]^b;
        
        if(map.containsKey(complement)){
            count=count+map.get(complement);
        }
        map.put(current,map.getOrDefault(complement,0)+1);
    }
    return (int)count;
  }
}
