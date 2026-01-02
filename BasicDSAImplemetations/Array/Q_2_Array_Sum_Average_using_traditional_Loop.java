package BasicDSAImplemetations.Array;
public class Q_2_Array_Sum_Average_using_traditional_Loop {
    public static void main(String args[]){
        //Q_2_Array_Sum_Average_using_traditional_Loop
        int nums[]={1,2,3,4,5};
        int sum=0; double average=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println("Sum is \n"+sum);
        average=(double)sum/nums.length;

         System.out.println("Average is \n"+average);
         int a=0;int b=nums.length; int newSum=0; double newAverage=0; 
        while(a<b){    
           //  System.out.println("Test  \n"); used this to check overflow i did a<=b
            newSum=newSum+nums[a];
            a++;
        }
         System.out.println("newSum is \n"+newSum);
         newAverage=(double)(newSum/b);

        System.out.println("newAverage is \n"+newAverage);
    }
}
