public class Arrays_Minimum_Picks {
    public static void main(String args[]){
        int arr[]={5,17,100,1};
        int max_even=0;        int max_odd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                max_even=arr[i];
            }

            if(arr[i]%2!=0){
                max_odd=arr[i];
            }
        }
        System.out.println(max_odd);
        System.out.println(max_even);
    }
    
}
