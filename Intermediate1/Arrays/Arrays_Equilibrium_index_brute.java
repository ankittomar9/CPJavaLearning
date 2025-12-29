package Arrays;
public class Arrays_Equilibrium_index_brute {
    public static void main(String args[]){
      int arr[]={-7, 1, 5, 2, -4, 3, 0};
      int n=arr.length;

        //select all  indexes from 0 to n-1
        for(int i=0;i<arr.length;i++){
            
            //Calculate sum before i that is 0 to i-1

            int left_Sum=0;
            for(int j=0;j<=i-1;j++){
                left_Sum=left_Sum+arr[j];
            }

            int right_Sum=0;
            for(int j=i+1;j<=n-1;j++){
                right_Sum=right_Sum+arr[j];
            }    

            if(left_Sum==right_Sum){
                System.out.println("Equlibrium index found at index "+i );
                  System.out.println("Left Sum : "+left_Sum+ " == Right Sum "+right_Sum );
                  return;

            }
        }
          System.out.println("Equlibrium index doesn't exists");   






    }
    
}
