public class Arrays_Equlibrium_index_Optimized_Final {
    public static void main(String args[]){
          int arr[] = {-7, 1, 5, 2, -4, 3, 0};
          int n=arr.length;


        int total_sum=0;
        for(int i=0;i<n;i++){
            total_sum=total_sum+arr[i];
        }
        System.out.println(total_sum);
        
        int left_sum=0;
        
        for(int i=0;i<arr.length;i++){
            int right_sum= total_sum - left_sum - arr[i];

         if(left_sum==right_sum){
                System.out.println("Equlibrium index found at index "+i );
                  System.out.println("Left Sum : "+left_sum+ " == Right Sum "+right_sum );
                  return;

            }
            left_sum=left_sum+arr[i];
             
         }
          System.out.println("Equlibrium index doesn't exists");  


    }
    
}
