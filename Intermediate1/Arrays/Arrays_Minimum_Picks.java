package Intermediate1.Arrays;
public class Arrays_Minimum_Picks {
    public static void main(String args[]){
        int arr[]={5,17,100,1};
        int max_even=Integer.MIN_VALUE;        int min_odd=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                max_even = Math.max(max_even, arr[i]);
             
            }
            if(arr[i]%2!=0){
                   min_odd=Math.min(min_odd, arr[i]);
            
              
            }
        }
        int result=max_even-min_odd;
        System.out.println(min_odd);
        System.out.println(max_even);
        System.out.println(result);

        
    }
    
}
