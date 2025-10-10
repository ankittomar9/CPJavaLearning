
import java.util.Arrays;

public class Arrays_Frequency_Array_Count {

    public static void main(String args[]){
        int arr[]={1,2,5,1,5,1};
        int arr2[]=new int[arr.length]; // 3 1 2 3 2 3

     
        for(int i=0;i<arr.length;i++){
                   int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                
                   count++;
               }
               
            }   
              arr2[i]=count;  
                         
        }
        System.out.println(Arrays.toString(arr2));
    }
    
}


/**
 * 
 * You are given an integer array A, you have to return an integer array of same size 
 * whose ith element is the frequency count of A[i] in array A .
 */