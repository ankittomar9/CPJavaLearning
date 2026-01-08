package dsa_advance.array;
public class Q_15_Arrays_equilibrium_index_Optimized_1 {
    public static void main(String args[]){
        int nums[]={-7,1,5,2,-4,3,0};
        //Optimize the equlibrium index with prefix sum

        int prefix_arr[]=new int[nums.length];
        prefix_arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+nums[i];
        }
        int n=prefix_arr.length;
        boolean isFound=false;
        for(int i=0;i<nums.length;i++){
            //left sum
            int leftSum=0;
            if(i==0){
                leftSum=0;
            }
            else{
                leftSum=prefix_arr[i-1];            }
            // right Sum 
            int rightSum=0; 
            int totalSum=prefix_arr[n-1];
            rightSum=totalSum-prefix_arr[i];
        
            if(leftSum==rightSum){
                System.out.println("Equilibrium Index found at "+i);
                System.out.println("Left sum : "+leftSum+" == " +rightSum+ " Right Sum");
                isFound=true;
                break;
            }
        }   
       if(isFound==false){
         System.out.println("Equilibrium Index doesn't exists");
       }                 
    }    
}
