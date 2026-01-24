package dsa_advance.hashmaps;

import java.util.HashSet;

public class Q_11_Count_Distinct_Elements {
    public static void main(String args[]){
        int arr[] = {10, 20, 20, 10, 30, 10};

          HashSet<Integer> set=new HashSet<>();
       
          for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }  
        System.out.println("Number of distinct elements: " + set.size());
    }
    
}
