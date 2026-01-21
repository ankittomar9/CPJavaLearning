package dsa_advance.hashmaps;

import java.util.HashSet;

public class Q_7_Intersection_of_Two_Arrays {
    public static void main(String args[]){
        int arr1[]={4,9,5};
        int arr2[]={9,4,9,8,4};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println(set);

        System.out.println("Intersection Elements:");
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
    }   
}
