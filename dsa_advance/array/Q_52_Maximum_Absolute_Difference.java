package dsa_advance.array;

public class Q_52_Maximum_Absolute_Difference {
    /*The Goal:You are given an array of integers A.You need to find the maximum value of this expression for any two indices i 
    and j:  f(i, j) = |A[i] - A[j]| + |i - j| */
    public static void main(String args[]){
        /*Hard part of this problem is to figure out the math take a pen and paper and see the math */
        int A[]={1,3,-1};
      int result=  solve(A);
          System.out.println("Max Absolute Difference: " + result); 
    }
    public static int solve(int A[]){
        int max1=Integer.MIN_VALUE;        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;        int min2=Integer.MAX_VALUE;


        for(int i=0;i<A.length;i++){
           int val1=A[i]+i;
           int val2=A[i]-i;
          //  Group 1 (Max and Min of A[i] + i)
           max1=Math.max(max1, val1);
           min1=Math.min(min1, val1);
        // Update Group 2 (Max and Min of A[i] - i)
             max2=Math.max(max2, val2);
           min2=Math.min(min2, val2);

        }
        int diff1=max1-min1;
        int diff2=max2-min2;
        return Math.max(diff1,diff2);
    }
}
