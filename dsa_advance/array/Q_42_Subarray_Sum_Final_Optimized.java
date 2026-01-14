package dsa_advance.array;
public class Q_42_Subarray_Sum_Final_Optimized {
    public static void main(String args[]){
        //How you optimize maximum subarray sum by using Kadanes algorithm
        //The Problem: Given an integer array (which contains negative numbers),
        //  find the contiguous subarray that has the largest sum.
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        //sum of whole array = 1
        //sum of this subaray[4,-1,2,1]
        // brute force was using two loops with carry forward technique 
        int start=0;int end=0;int tempStart=0;
        int currentSum=arr[0];
        int maxSum=arr[0];

        for(int i=0;i<arr.length;i++){
            if(currentSum+arr[i]>arr[i]){
                currentSum=currentSum+arr[i];
            }else{
                currentSum=arr[i];
                tempStart=i;
            }

            if(currentSum>maxSum){
                maxSum=currentSum;
                start=tempStart;
                end=i;
            }


        }
      
        
       System.out.println("Maximum subarray sum is \n "+maxSum);
       System.out.println("Indices: (" + start + ", " + end + ")");         
        }
    }

