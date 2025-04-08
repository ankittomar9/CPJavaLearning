package if_else;
public class SubarraySumKadane {

    public static void main(String args[]){
        int arr[] ={2,3,-8,7,-1,2,4};
        int n=arr.length; int result=arr[0];
        int maxEndingSum=arr[0];

        for(int i=1;i<n;i++){
            int new_result=maxEndingSum+arr[i];
            maxEndingSum=Math.max(new_result,arr[i]);
           
            result =Math.max(result,maxEndingSum);
        
        }

       System.out.println(result);

    }
    
}
