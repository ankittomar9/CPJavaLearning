package BasicDSAImplemetations.Array;

public class Q_7_Array_Reverse_using_another_array {
    public static void main(String args[]){
        int nums[]={10,20,30,40,50,60};

        int waste_array_memory[]=new int[nums.length];
        int pointer=0;

        for(int i=nums.length;i>0;i--){
            waste_array_memory[pointer]=nums[i-1];
            pointer++;
        }

        for(int variable:nums){
             System.out.print(variable +" ");
        }
          System.out.println(" \n I am Separator : \n");

           System.out.println("Array is reversed and you wasted memory: ");
        for(int variable1:waste_array_memory){
             System.out.print(variable1+" ");
        }
       
    }
    
}
