
import java.util.Arrays;

public class ArraysPrefixSum {
    public static void main(String args[]){

        int arr[]={1,1,2,4,7,8,6};
        int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=arr[i]+prefix_arr[i-1];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(prefix_arr));

    }
    
}
