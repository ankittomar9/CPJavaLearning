import java.util.Arrays;

public class Arrays_Equlibrium_index_Optimized {
    public static void main(String args[]){
         int arr[]={1,2,3,4,8,10}; int n=arr.length;
         int pf_arr[]=new int[n];
         pf_arr[0]=arr[0];

         for(int i=1;i<n;i++){
            pf_arr[i]=pf_arr[i-1]+arr[i];
         }
         System.out.println("Prefix Sum Array: " + Arrays.toString(pf_arr));

         int equilibrium_index=-1; int value_at_equilibrium_index=-1;
         for(int i=0;i<n;i++){
            if(pf_arr[i-1]==pf_arr[n-1]-pf_arr[i]){
                equilibrium_index=i;
                value_at_equilibrium_index=arr[i];

              
            }
         }

           System.out.println("equilibrium_index : "+equilibrium_index);
           System.out.println("value_at_equilibrium_index : "+value_at_equilibrium_index);



         

    }
    
}
