package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashSet;
public class Q_8_Union_of_Two_Arrays {
    public static void main(String args[]){
        int arr1[]={7,3,9,2};   System.out.println("Original Array 1: \n"+Arrays.toString(arr1));
        int arr2[]={6,3,9,2,2,4,9};
              System.out.println("Original Array 2: \n"+Arrays.toString(arr2));
        unionHelper(arr1,arr2);
    }
    public static void unionHelper(int arr1[],int arr2[]){
         if(arr1==null || arr2==null || arr1.length==0 || arr2.length==0){
            System.out.println("arrays are null or empty");return;
        }
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
            System.out.println("HashSet : "+set);
  
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println("Union Elements : ");
          System.out.println("Union Size : "+set.size());
         System.out.println("Union Result : "+set);
         //Note we can use a arrayList and add elements but only thing is it won't filter duplicates automatically

    }
}
