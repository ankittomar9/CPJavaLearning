package dsa_advance.array;
public class Q_15_Arrays_Equlibrium_Index_Optimized_Final {
    public static void main(String args[]){
         int nums[]={-7,1,5,2,-4,3,0};
         //Optimize without prefix array          //1.Calculate total sum 2 Maitain LeftSum and calculate on fly
            int totalSum=0;
         for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            }
            System.out.println(totalSum);

            boolean isFound=false;
            int leftSum=0;
            for(int i=0;i<nums.length;i++){

                int rightSum=totalSum-leftSum-nums[i];

                 if(leftSum==rightSum){
                System.out.println("Equilibrium Index found at "+i);
                System.out.println("Left sum : "+leftSum+" == " +rightSum+ " Right Sum");
                isFound=true;
                break;
            }
            leftSum=leftSum+nums[i];

          }
           if(isFound==false){
         System.out.println("Equilibrium Index doesn't exists");
       }  
    }
}
