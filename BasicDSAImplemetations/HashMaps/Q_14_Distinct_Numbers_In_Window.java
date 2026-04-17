package BasicDSAImplemetations.HashMaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Q_14_Distinct_Numbers_In_Window {
    public static void main(String args[]){
        int arr[]={1,2,1,3,4,3}; int k=3;
        // we need to count how many distinct elements are there in a window
        // [1,1,1] = count 1 but [2 1 3 ] count is 3
        distinctNumberInWindow(arr,k);
    }
    public static void distinctNumberInWindow(int arr[],int k){
    if(arr==null || arr.length==0 ){
            System.out.println("Array is Empty or Null or window size is less than");return;}
                            
            HashMap<Integer,Integer> map=new HashMap<>();
            //Step 1 : create a frequency HashMap
            for(int i=0;i<k;i++){
                    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
             System.out.println("First Window HashMap is :  \n"+map);
            List<Integer> list=new ArrayList<>();
            list.add(map.size());
            //Window movement
            for(int i=k;i<arr.length;i++){
                int outgoing=arr[i-k];
                //Removing the element going OUT (index -k)
                if(map.get(outgoing)==1){
                    map.remove(outgoing);
                }else{
                    map.put(outgoing, map.get(outgoing)-1);
                }
                int incoming=arr[i];
                map.put(incoming, map.getOrDefault(incoming,0)+1);
                list.add(map.size());
            }
            System.out.println("Distinct counts per window: \n" + list);
        }
    }

