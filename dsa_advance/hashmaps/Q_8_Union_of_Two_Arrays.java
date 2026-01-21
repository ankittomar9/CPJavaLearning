package dsa_advance.hashmaps;
import java.util.HashSet;
public class Q_8_Union_of_Two_Arrays {
    public static void main(String args[]){
         int arr1[]={7,3,9};
          int arr2[]={6,3,9,2,2,4};

                HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println(set);

        System.out.println("Union Elements:");
        for(int i=0;i<arr2.length;i++){
           set.add(arr2[i]);
        }

        System.out.println("Union Size: " + set.size());
        System.out.println("Union Elements: " + set);
    } 
}
