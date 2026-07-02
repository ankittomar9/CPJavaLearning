package dsa_intermediate.arrays;
import java.util.Arrays;
public class Q_3_Array_Minimum_Maximum {
    public static void main(String[] args) {
        int[] arr={66,4,8,6,99,2,3,6,4,1,5};
        System.out.println("Original Array : \n"+Arrays.toString(arr));
        findMaxMin(arr);
        
    }
    public static void findMaxMin(int[] arr){
        if(arr==null || arr.length==0){
        System.out.println("null or empty array");    return ;
        }

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
        System.out.println("maximum value in Array is :"+max);
        System.out.println("minimum value in Array is :"+min);
    }

}
