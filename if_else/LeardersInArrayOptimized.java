package if_else;
public class LeardersInArrayOptimized {

    public static void main(String args[]){
       int arr[]={8,-2,7,6,5 ,1};
       int n=arr.length; int ans=1;
        int maxElement=arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxElement){
                ans++;
                maxElement=arr[i];
            }
        }
        System.out.println("Leaders in array : "+ ans);

    }
}
