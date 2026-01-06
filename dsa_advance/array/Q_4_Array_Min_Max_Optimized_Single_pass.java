package dsa_advance.array;

public class Q_4_Array_Min_Max_Optimized_Single_pass {
    public static void main(String args[]){
        int arr[]={10,99,12,55,3,44};
        //Find minimum and maximum in the array.  
        //Do this in single pass 
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

         System.out.println("Maximum element is \n "+max);
          System.out.println("Minimum element is \n "+min);
        
    }
    
}
