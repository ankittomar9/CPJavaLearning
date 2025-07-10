package if_else;
public class ElementGreaterthanItself {
    public static void main(String args[]){
        int arr1[]={1,5,4,3,9,7,55,15,6,7,12,20,12,30,25};
        int x=Integer.MIN_VALUE;int count=0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>x)
                 x=arr1[i];
                      
        }
        for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]==x){
                    count++;
    }
            }

        int ans=arr1.length-count;
        System.out.println(ans);
    }
    
}
