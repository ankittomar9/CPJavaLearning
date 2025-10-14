package Arrays1D;
public class Arrays_Even_Odd_elementsDIFF {
    public static void main(String args[]){
        int arr[]={2, 3, 5, 1};

        int even_Count=0;
        int odd_Count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_Count++;
            }else if(arr[i]%2!=0){
                odd_Count++;
            }

        }
        int x=even_Count-odd_Count;
        System.out.println(even_Count);
         System.out.println(odd_Count);
        System.out.println(x);
        
        System.out.println("The absolute count is "+ Math.abs(x));

    }
}


/*
array A, you have to find the value of absolute difference
 between the counts of even and odd elements in the array.
 1
3
-2
The absolute count is 2 
 */