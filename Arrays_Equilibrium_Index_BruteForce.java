public class Arrays_Equilibrium_Index_BruteForce {
    public static void main(String args[]){
        int arr[]={1,2,3,4,8,10}; int n=arr.length;
        for(int i=0;i<arr.length;i++){
           
            // 1. Calculate Left Sum
            int left_Sum=0;
            for(int j=0;j<i;j++){ // sum(0 -> i-1) == sum(i+1 -> n-1)
                left_Sum=left_Sum+arr[j];
            }

            // 2. Calculate Right Sum
             int right_Sum=0;
            for(int j=i+1;j<n;j++){
                right_Sum=right_Sum+arr[j];
            }
        
            if(left_Sum==right_Sum){
                System.out.println("Equlibrium index found at index "+i );
                  System.out.println("Left Sum : "+left_Sum+ " == Right Sum "+right_Sum );
                  return;
            }

        }
        System.out.println("No equilibrium index found.");

    }
    
}


// what is an Equilibrium_Index:
//An Equilibrium Index is that index which the sum of its left and right elements are equal
//Sum of elements  on left==sum on elements on right;