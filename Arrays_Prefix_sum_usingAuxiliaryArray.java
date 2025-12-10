import java.util.Arrays;

public class Arrays_Prefix_sum_usingAuxiliaryArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int pf_arr[]=new int[arr.length];

        pf_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
        pf_arr[i]=pf_arr[i-1]+arr[i];
        }

        System.out.println(Arrays.toString(arr));
          System.out.println(Arrays.toString(pf_arr));
    }
    
}

