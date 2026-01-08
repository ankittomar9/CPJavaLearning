package dsa_advance.array;

public class Q_15_Arrays_Equilibrium_index_brute {
    public static void main(String args[]){
        int arr[]={-7,1,5,2,-4,3,0};
        //What is Equilibrium Index Index which has left sum and right sum equal
        int left_sum=0;int right_sum=0;
        int index=0; boolean isFound=false;
        for(int i=0;i<arr.length;i++){
            index=i;
            //reset sum everytime
            left_sum=0;
            //Calculate left sum
            for(int j=0;j<i;j++){
                      left_sum=left_sum+arr[j];
                }
                
              //Calculate right sum
              right_sum=0;
             for(int j=i+1;j<arr.length;j++){
                right_sum=right_sum+arr[j];
            }
            if(left_sum==right_sum){
                System.out.println("Equilibrium Index Found at "+index);
                System.out.println("Left sum : "+left_sum+" == Right sum :"+right_sum);
                isFound= true;
                break;
            }
        }
         if(isFound==false){
                 System.out.println("Equilibrium Index does not exist ");
    
         }
         
    }
    
}
