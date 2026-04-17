package BasicDSAImplemetations.HashMaps;
import java.util.Arrays;
import java.util.HashMap;
public class Q_10_First_Repeating_Element {
    public static void main(String args[]){  
         /* Problem: Given arr[] = {10, 5, 3, 4, 3, 5, 6}.
        Goal: Return the one that occurs earliest in the array. */
        int arr[]={10, 5, 3, 4, 3, 5, 6};System.out.println("Original Array :\n"+Arrays.toString(arr));
        firstRepeatingElement(arr);
    }
    public static void firstRepeatingElement(int arr[]){
        if(arr==null || arr.length==0){
            System.out.print("Array is null or empty ");return;        }
        HashMap<Integer,Integer> map=new HashMap<>();
            // Step 1: Build Frequency Map
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }               }
        System.out.println("HashMap is :  \n"+map);
                // Step 2: Check for the first one with count > 1
                boolean isFound=false;
                for(int i=0;i<arr.length;i++){
                    if(map.get(arr[i])>1){
                        System.out.println("First Repeating Element is : \n"+arr[i]);
                        isFound=true; 
                        break;
                    }
                }
                if(!isFound){
                    System.out.println(" NO First Repeating Elements exists  ");
                }        }    }
