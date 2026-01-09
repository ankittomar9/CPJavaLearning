package dsa_advance.array;

public class Q_18_Arrays_Leaders_in_array_optimized {
    public static void main(String args[]){
          int arr[]={16,17,4,3,5,2}; 
            int n=arr.length;
            //Since we are using Carry Forward technique what we want is 
            //carry the max value from right think about why i know why because last element is always a leader
            int max_so_far=arr[n-1];
            int leaders_count=1;
          for(int i=n-2;i>=0;i--){
            if(arr[i]>max_so_far){
                max_so_far=arr[i];
                leaders_count++;
            }
          }

          System.out.println("Leader Count in array : \n "+leaders_count);
    }
    
}
