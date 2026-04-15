package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_4_Frequency_HashMap {
    public static void main(String args[]){
        int arr[]={45,12,10,3,5,6,99,48,36,28,12};
        System.out.println("Original Array \n"+Arrays.toString(arr));
        frequencyHashMapHelper(arr);

    }
    public static void frequencyHashMapHelper(int arr[]){
        if(arr==null || arr.length==0){
            System.out.println("Array is Empty or Null"); return;
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
         System.out.println("Frequency HashMap ");
          System.out.println(map);

    }
}
