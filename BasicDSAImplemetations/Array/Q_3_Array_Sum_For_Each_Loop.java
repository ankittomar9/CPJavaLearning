package BasicDSAImplemetations.Array;

public class Q_3_Array_Sum_For_Each_Loop {
    public static void main(String args[]){
        //Q_3_Array_Sum_For_Each_Loop
       int nums[]={1,2,3,4,5}; 
        
       int sum=0; double average;
        //Think no indexes here to manipulate
       for(int variable:nums){
        sum=sum+variable;
       }

       System.out.println(" Sum " +sum );

        average =(double)sum/nums.length;    

       System.out.println(" Average : \n " +average );
   
    }
    
}
