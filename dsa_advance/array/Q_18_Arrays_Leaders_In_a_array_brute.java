package dsa_advance.array;
import java.util.ArrayList;
import java.util.List;
public class Q_18_Arrays_Leaders_In_a_array_brute{
    public static void main(String args[]){
        int arr[]={16,17,4,3,5,2}; 
        int n=arr.length;
        //What is a Leader in Array
        // An element is a Leader if it is strictly greater than all the elements to its right.
        // is 16 leader no 16 is smaller than 17 , 17 is L because its greater than all elements 
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
              boolean isLeader=true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader==true){
                   list.add(arr[i]);
         }
        }
        System.out.println(list);
    }
}
