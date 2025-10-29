package Refresher_Complete.Arrays2D;
import java.util.Arrays;

public class Arrays_Prefix_sum {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int prefix_arr[]=new  int[arr.length];

        prefix_arr[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }

        System.out.println(Arrays.toString(prefix_arr));
    }
    
}

/*Prefix Array  creation for Range sum queries */