package dsa_advance.array;

public class Q_49_Max_Consecutive_Ones_II {
    public static void main(String args[]){
       int arr[] = {1, 0, 1, 1, 0, 1};int n=arr.length;int k=1;
        int left=0;int zeroCount=0;
        int maxLength=0;
        for(int right=0;right<n;right++){
            if(arr[right]==0){
                zeroCount++;
            }
            while(zeroCount > k){
               if(arr[left]==0){
                zeroCount--;
               }
               left++;
            }
            maxLength=Math.max(maxLength, right-left+1);

        }

      System.out.println("Max Consecutive Ones(length)(flipping 1 zero): " + maxLength);

    }
    
}
