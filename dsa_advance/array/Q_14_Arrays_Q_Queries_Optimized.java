package dsa_advance.array;
import java.util.Arrays;
public class Q_14_Arrays_Q_Queries_Optimized {
    public static void main(String args[]){
        int arr[]={10,20,10,5,-16};
          System.out.println("Original Array \n "+Arrays.toString(arr));
      
         int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
          System.out.println("Prefix Array \n "+Arrays.toString(prefix_arr));
          int[][] queries = {
            {1, 3},   // Query 1: sum from index 1 to 3
            {0, 4},   // Query 2: sum from index 0 to 4 (Edge case s=0)
            {2, 2}    // Query 3: sum of just index 2
        };
        //Query sum  s=1 ,e=3;        //int s=1;int e=3; 
        int sum=0;
        for(int i=0;i<queries.length ;i++){
            int s=queries[i][0];
            int e=queries[i][1];

            if(s==0){
                sum=prefix_arr[e];
            }else{
                 sum=prefix_arr[e]-prefix_arr[s-1]; //
            }
           System.out.println("Range [" + s + ", " + e + "] Sum = " + sum);
        }
    }    
}
