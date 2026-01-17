package dsa_advance.array;
public class Q_44_Maximum_Average_Subarray {
    public static void main(String args[]){
    /*Problem: Given an array of integers and fixed k, find the maximum average of 
    any subarray of exactly size k. Return as double.(e.g. arr=[1,12,-5,-6,50,3], 
    k=4 → max average = 12.75 from [12,-5,-6,50]) */
        //Step1 :Find the max Subarray array
        int arr[]={1,12,-5,-6,50,3};int n=arr.length;int k=4;
        int currentSum=0; 
         if(n==0 || n<k){
                System.out.println("-1"); return;   }
        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }
        double maxSum=currentSum;

        for(int i=k;i<n;i++){
            currentSum=currentSum+arr[i]-arr[i-k];

            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        System.out.println("Maximum Subarray Sum is : "+maxSum);

        double average=maxSum/k;

        System.out.println("Maximum Average is : "+average);

    }
    
}
