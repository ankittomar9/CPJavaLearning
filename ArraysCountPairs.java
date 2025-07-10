import java.util.Scanner;
public class ArraysCountPairs {
    public static void main(String args[]){
         int arr[]={2,5,1,4,8,0,8,1,3,8};
         Scanner scn=new Scanner(System.in);
         int x=scn.nextInt();
         int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
           
                if(arr[i]+arr[j]==x)                
                    count++;
                  
            }
        }
            System.out.println(" "+count);

    }


    
}


/* i j pairs where i!=j and arr[i]+arr[j]=k */