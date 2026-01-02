package BasicDSAImplemetations.Array;

public class Q_8_Array_Is_Array_sorted {
    public static void main(String args[]){
        //Q_8_Array_Is_Array_sorted 
      //  int nums[]={10,20,30,40,50,60};
        int nums[]={5,10,20,40,30,60,10,50};
        boolean isSorted=true;
        int Inspector=0;
        for(int i=0;i<nums.length-1;i++){  
        //  nums.length -1 is basically last second index
            if(nums[i]>nums[i+1]){
                 Inspector=i;
                isSorted=false;
                break;
            }
        }
        if(isSorted==true){
             System.out.println("\n Array is Sorted \n");
        }else{
             System.out.println("\n Array is  not Sorted \n");
              System.out.println("\n Inspector caught violation at : "+Inspector);
        }

    }
    
}
