package dsa_advance.array;
import java.util.Arrays;
public class Q_53_Rain_water_trapping_ {
    public static void main(String args[]){
        int arr[]={4,0,3};
        if (arr == null || arr.length < 3) {
                System.out.println("Total Water Trapped: 0");
                return;             }
        solve(arr);
    }
    public static void solve(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[n];
        int rightMax[] = new int[n];

        leftMax[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        System.out.println("Left Max: " + Arrays.toString(leftMax));

          rightMax[n-1]=arr[n-1];
         for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        System.out.println("Left Max: " + Arrays.toString(rightMax));

        int totalWater = 0;
         for(int i=0;i<arr.length;i++){
           int roof = Math.min(leftMax[i], rightMax[i]);
            int stored = roof - arr[i];

            if (stored > 0) {
                totalWater =totalWater+ stored;
            }
         }
         System.out.println("Total Water Trapped: " + totalWater);

    }
    
}
