package dsa_advance.array;
import java.util.Arrays;

public class Q_11_Multiple_left_rotation_q_queries {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};  int n=arr.length;
         System.out.println("Original Array \n "+Arrays.toString(arr));
        int tempArr[]=Arrays.copyOf(arr,n);
        int b=2;
       // int b[]={2,3};
        // b=2 result= arr={3,4,5,1,2} expected output
        // b=3 result  arr={4,5,1,2,3}  expected output
        int start=0;int end=n-1;

        ReverseHelper(arr,0,b-1);
        ReverseHelper(arr,b,n-1);
        ReverseHelper(arr,0,n-1);
        System.out.println("\n Left Rotated Array \n"+Arrays.toString(arr));
     }
     public static void ReverseHelper(int arr[],int start,int end){
        int i=start; int j=end;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
     }   
}
