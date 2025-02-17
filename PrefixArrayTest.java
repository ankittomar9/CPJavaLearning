
import java.util.Arrays;
public class PrefixArrayTest {
  public static void main(String args[]){
   // int[] arr1={2,3,4,8,6,7,5};//[2, 5, 9, 17, 23, 30, 35]
   int[] arr1={-3,6,2,4,5,2,8,-9,3,1}; //[-3, 3, 5, 9, 14, 16, 24, 15, 18, 19]

   //pf[i] =sum(0-i)=pf[i-1]+A[i] 

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
