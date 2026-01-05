package dsa_advance.array;
import java.util.Arrays;

public class Q_1_Rotate_Array_k_times_brute {
    public static void main(String[] args){
        int arr[]={1,2,3,4};  // expected output is : 3 4 1 2 
        int k=2;   System.out.println(Arrays.toString(arr));
        int n= arr.length;
        int temp=n;  // value 

        // k=k%n   // optimization what if k=72 you won't rotate 72 times

        //shift element 1 by 1 towards the right 

        for(int i=0;i<k;i++){

        }



    }
}
