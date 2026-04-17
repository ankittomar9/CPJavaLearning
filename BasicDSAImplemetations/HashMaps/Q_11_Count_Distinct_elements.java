package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class Q_11_Count_Distinct_elements {
    public static void main(String args[]){
         int arr[]={2,4,8,4,6,3,6,2,3,1,5,7,1,8,2,4,6,7};
         System.out.println("Original Array :\n"+Arrays.toString(arr));
        countDistinctHelper(arr);
    }
    public static void countDistinctHelper(int arr[]){
        if(arr==null || arr.length==0){
            System.out.println("Array is null or empty");return;
        }
        //Using HashMap 
         System.out.println("----- Using HashMap -----");
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("Frequency HashMap : \n"+map);
        System.out.println("Distinct Elements : \n"+map.keySet());
         System.out.println("Count of Distinct Elements \n"+map.size());

        //Using HashSet
        //Question Is HashSet Ordered : Answer no  only treeSet is Ordered
          System.out.println("----- Using HashSet -----");
            HashSet<Integer> set=new HashSet<>(); 
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
         System.out.println("Count of Distinct Elements \n"+set.toString());
          System.out.println("Distinct Elements : \n"+set.size());
    }
}
