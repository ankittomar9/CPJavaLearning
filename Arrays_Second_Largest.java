public class Arrays_Second_Largest{
    public static void main(String args[]){
        int arr[]={2,1,7,8,6,4,9,8,4,3};

        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                  second_max=max;
                max=arr[i];
              
            }
             if(arr[i]>max && arr[i]<second_max){  
                second_max=max;
            }
            
        }
        System.out.println("First Largest : "+max);
        System.out.println("Second Largest :  "+second_max);

        }
    
}

/*/
2 somevalue  max= 2 second =somevalue
7  2    
8  7




*/