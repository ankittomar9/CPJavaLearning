package basicDSAImplemetations.array;

public class Q_9_Array_Find_max_min_element_array {
    public static void main(String args[]){
        int nums[]={10,50,99,5,20};
        int n=nums.length;

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        //Think why MAX_VALUE initialized and not arr[0]
          System.out.println("Initial max value : \n"+max);
           //Think why MIN_VALUE initialized and not arr[0]
          System.out.println("\nInitial min value : \n"+min);

        for(int i=0;i<n;i++){
          if(nums[i]>=max){
            max=nums[i];
          }
          if(nums[i]<min){
            min=nums[i];
          }

        }
          System.out.println("\nFinal max value : \n"+max); 
          System.out.println("\nFinal min value : \n"+min); 


    }
    
}
