package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_9_Frequency_of_element_query {
    public static void main(String args[]){
         /*Problem Statement Given array A = {2, 5, 9, 2, 8} and query array B = {3, 2,8}. 
            For each number in B, return how many times it appears in A */
            int arr1[]={4, 5, 9, 4, 8};
             System.out.println("Original Array 1: \n"+Arrays.toString(arr1));
             int arr2[]={3, 4,8}; // {3 , 2 ,8 }
             System.out.println("Original Array 2: \n"+Arrays.toString(arr2));
             queryElementHelper(arr1,arr2);
    }
    public static void queryElementHelper(int arr1[],int arr2[]){
         if(arr1==null || arr2==null || arr1.length==0 || arr2.length==0){
            System.out.println("arrays are null or empty");return;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i])+1);
            }else{
                map.put(arr1[i], 1);
            }        }
        System.out.println("HashMap : \n"+map);
           System.out.println("Query Results: How times arr2[i] B present in A arr1[i]");

           for(int i=0;i<arr2.length;i++){
            int queryNum=arr2[i];
              if(map.containsKey(arr2[i])){
                System.out.println(queryNum + " -> " + map.get(queryNum)+" times ");
              }else{
                     System.out.println(queryNum + " -> 0 times ");
              }           }    }        }
