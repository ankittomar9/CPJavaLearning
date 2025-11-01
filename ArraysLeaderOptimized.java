public class ArraysLeaderOptimized {

    public static void main(String args[]){
        int[] arr={10,7,9,3,2,4};
        int n=arr.length;
       int max=arr[n-1];
        int ans=1;
        int i;
        for( i=n-2; i>=0;i--){
            if(arr[i]>max){
                ans++;
                max=arr[i];
            }

        }


        System.out.println(ans);
    }
    
}

/* Carry Forward approach
Leaders in a Array
 * 
 * Whats a  Leader:
 * An element that is strictly greater
 *  than all the elements on its right side
 * A[i]> A>[i+1 ... n-1]
 */