package dsa_advance.bitmanipulation;
public class Q_9_Interesting_array {
    /*The Problem You are given an array of numbers. You can perform the following operation any number of times:
        Pick any element v from the array.
        Remove it
        Add two new numbers a and b to the array such that a + b = v.
        Goal: Can you make the XOR of all elements in the array equal to 0?
        Return "Yes" or "No".  
    */
    public static void main(String args[]){
        int arr[]={9,17};
        //long sum=0;
        long result=0;

        for(int i=0;i<arr.length;i++){
           // sum=sum+arr[i];
           result=result^arr[i];
        }
         //System.out.println(sum);

       // if(sum%2 ==0){ // other way to right the below code
            if((result & 1 )==0){
            System.out.println("Yes");
        }else{
             System.out.println("No");
        }
    }
    
}
