package dsa_advance.hashmaps;

import java.util.HashMap;

public class Q_9_Frequency_of_element_query {
    public static void main(String args[]){
        int arr1[]={2, 5, 9, 2, 8};
        int arr2[]={3, 2,8};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i])+1);
            }else{
                map.put(arr1[i], 1);
            }

        }
        System.out.println(map);
      
         for(int i=0;i<arr2.length;i++){
            int queryNum=arr2[i];
          if(map.containsKey(queryNum)){
                System.out.println("Number " + queryNum + " frequency: " + map.get(queryNum));
            } else {
                System.out.println("Number " + queryNum + " frequency: 0");
            }
         }
         
    }
    
}
