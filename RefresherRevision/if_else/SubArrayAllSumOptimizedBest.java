package if_else;
public class SubArrayAllSumOptimizedBest {
    public static void main(String args[]){
    int ans=0;
    //int arr[]={2,4,7,3,6,4,12,15,20};
    int arr[]={3,-2,4,1,2,6};  // 114 output
    int n=arr.length;

    for(int i=0; i<n;i++){
        ans=ans+(i+1)*(n-i)*arr[i];
    }
    System.out.println(ans);
    
}
}