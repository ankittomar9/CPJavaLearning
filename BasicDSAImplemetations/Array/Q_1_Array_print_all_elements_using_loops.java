package BasicDSAImplemetations.Array;

public class Q_1_Array_print_all_elements_using_loops {
    public static void main(String args[]){
        // Q_1_Array_print_all_elements_using_loops
        // Use different Loops to traverse the Array
        int nums[]={1,2,3,4,5,6,7,8,9};

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int a=0;int b=nums.length-1;
        while(a<=b){
            System.out.print(nums[a]+" ");
            a++;
        }
         System.out.println();
            for(int variable: nums){
                 System.out.print(variable +" ");
            }
    }
    
}
