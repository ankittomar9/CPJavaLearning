package Arrays;
import java.util.Arrays;
public class Arrays_Equlibrium_index_Optimized_prefix {
    public static void main(String args[]){
          int arr[]={-7, 1, 5, 2, -4, 3, 0};
          int n=arr.length;
         int prefix_arr[]=new int[n];

         prefix_arr[0]=arr[0];
         for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
         }    
        System.out.println("original array : ");
         System.out.println(Arrays.toString(arr));
         System.out.println("Prefix array : ");
         System.out.println(Arrays.toString(prefix_arr));

         for(int i=0;i<n;i++){

            int total_sum=prefix_arr[n-1];
            //left sum
            int left_sum=0;
            if(i==0){
                left_sum=0;
            }else{
                left_sum=prefix_arr[i-1];
            }
            //right sum 
            int right_sum=0;
             right_sum=total_sum-prefix_arr[i];

            
            if(left_sum==right_sum){
                System.out.println("Equlibrium index found at index "+i );
                  System.out.println("Left Sum : "+left_sum+ " == Right Sum "+right_sum );
                  return;

            }
             
         }
          System.out.println("Equlibrium index doesn't exists");  

    }
    
}
