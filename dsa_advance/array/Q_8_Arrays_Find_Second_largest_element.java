package dsa_advance.array;

public class Q_8_Arrays_Find_Second_largest_element {
    public static void main(String args[]){
        //Approach 1 : run two loops and find the second largest T:C O(N + N)
        //Approach 2 : Sort the Array to ascending and N-2 position element is largest
        // TC O(nlogn) inefficient
        //Approach 3 : maintain two variable state of Max
        int nums[]={10,2,99,3,4,55,21,25,33};

        int max=Integer.MIN_VALUE;
        int second_max=max;


        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];   
            }
            else if(nums[i]>second_max && nums[i]!=max){
                second_max=nums[i];
            }
           
        }
        if(second_max==Integer.MIN_VALUE){
                System.out.println("No second largest element exists.");
        }else{
             System.out.println("Maximum element is  : \n"+max);
        System.out.println("Second Maximum element is  : \n"+second_max);
        }

       
    }
    
}
