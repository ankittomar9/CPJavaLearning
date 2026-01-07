package dsa_advance.array;
import java.util.Arrays;
public class Q_3_Array_Min_Max_brute {
    public static void main(String args[]){
        int arr[]={10,99,12,55,3,44};
        //Find minimum and maximum in the array.  
        //Never do this appraoch in Interview 
        int max=arr[0];int min =arr[0];
        // two loops finding min and max
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
        }   
         System.out.println("Maximum element is \n "+max);

         for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
               min=arr[i];
            }
                }   
         System.out.println("Minimum element is \n "+min);

        // Sort the array
         Arrays.sort(arr);
        int max1=arr[arr.length-1];
         int min1=arr[0];

         System.out.println("Maximum element sort \n "+max1);
           System.out.println("Minimum element sort \n "+min1);
    }    
}
