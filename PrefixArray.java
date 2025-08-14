import java.util.Arrays;
class PrefixArray{

public static void main(String args[]){
     int[] arr1={[8, 3, 1, 8, 0, 8, 4, 1, 5, 2]}; 

     //pf[i] =sum(0-i)=pf[i-1]+A[i]

        int n=arr1.length; int sum=0;
        int prefix_arr[]=new int[n];


        
    int n=arr1.length; int sum=0;
    int prefix_arr[]=new int[n]; 
    
    for(int i=0;i<n;i++){
        sum=sum+arr1[i];
        prefix_arr[i]=sum;
    }
    System.out.println(Arrays.toString(arr1));  // SC O(N) original array modified 
  //  System.out.println(Arrays.toString(prefix_arr)); SC // O(N) original array intact
    //[2, 5, 9, 17, 23, 30, 35]
}
}




