package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashSet;
public class Q_7_Intersection_of_Two_Arrays {
    public static void main(String args[]){
        int arr1[]={4,9,5}; System.out.println("Original Array 1: \n"+Arrays.toString(arr1));
        int arr2[]={9,4,9,8,4};
        System.out.println("Original Array 2: \n"+Arrays.toString(arr2));
        intersectionHelper(arr1,arr2);
    }
    public static void intersectionHelper(int arr1[],int arr2[]){
        if(arr1==null || arr2==null || arr1.length==0 || arr2.length==0){
            System.out.println("arrays are null or empty");return;
        }
      //  HashMap<Integer,Integer> map=new HashMap<>(); why can't we use this
      HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println("HashSet : "+set);

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.println("Removed Element : "+arr2[i]);
                set.remove(arr2[i]);
            }
        }
         System.out.println("HashSet : "+set);
    }
}
