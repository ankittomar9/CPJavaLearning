package if_else;
public class SubArrayAllSum {
    public static void main(String args[]){
        //int arr[]={4,1,3,6};
        int arr[]={2,8,9};
       // int sum=0; wrong declaration here inside loop is correct
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                  //  System.out.println("Sum of all sub arrays : "+sum);
                }
                System.out.println("Sum of subarray [" + i + " to " + j + "] : " + sum);
            }
        }
       


    }
    
}
