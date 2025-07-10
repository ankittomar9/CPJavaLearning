package if_else;
public class findmaxelementinarray {

    public static void main(String args[]){
        int arr1[]={1,5,4,3,9,7,55,20,12,30,25};
        int x=Integer.MIN_VALUE;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>x)
            x=arr1[i];
        }
        
        System.out.println(x);
    }
    
}
