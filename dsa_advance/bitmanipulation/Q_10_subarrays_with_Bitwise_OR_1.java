package dsa_advance.bitmanipulation;
public class Q_10_subarrays_with_Bitwise_OR_1 {
    /*Problem Statement Given an array B of length N containing only 0s and 1s.
     Find the number of subarrays where the Bitwise OR of all elements is 1. */
    public static void main(String args[]){
        int arr[]={1,0,1,0};  // {1, 0, 0, 1}; 
          int n=arr.length;// output // 7
        // Find subarrays for which doing OR | makes it good array 
        //Brute force checking all subarrays and checking it has 1 in it O(N^2)

        //Optimized          //Step 1 Calculate total Subarrays
        long total_subarrays=n*(n+1)/2;  //     System.out.println(total_subarrays);

        //Step 2: count array having zeroes
        long bad_subarray = 0; // subarray having only zeroes
        long count = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }else{
              bad_subarray = bad_subarray + (count * (count + 1)) / 2;
              count = 0;
            }
        }
        if (count > 0) {
            bad_subarray = bad_subarray +  (count * (count + 1)) / 2;
        }

        long good_subarrays = total_subarrays - bad_subarray;     
        System.out.println("Good Subarrays are: " + good_subarrays);
    }
    
}
