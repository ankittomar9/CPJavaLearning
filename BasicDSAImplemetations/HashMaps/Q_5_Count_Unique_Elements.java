package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Q_5_Count_Unique_Elements {
    public static void main(String args[]){
         int arr[]={3, 3, 3, 9, 0, 1, 0};
        System.out.println("Original Array \n"+Arrays.toString(arr));
        countUniqueHelper(arr);
    }
    public static void countUniqueHelper(int arr[]){

        if(arr==null || arr.length==0){
            System.out.println("Array is Empty or Null"); return;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
         System.out.println("Frequency HashMap \n"+map);
         int count=0;
    
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                count++;
            }
         }
           System.out.println("Unique Elements Count \n"+count);
    }      
}
