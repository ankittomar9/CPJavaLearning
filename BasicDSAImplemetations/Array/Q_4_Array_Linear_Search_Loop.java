package BasicDSAImplemetations.Array;
public class Q_4_Array_Linear_Search_Loop {
    public static void main(String args[]){
        //Q_4_Array_Linear_Search_Loop
        int nums[]={10,50,30,70,80,20};
        int target=30;
        boolean isFound=false; int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
                isFound=true;
                break;
            }              
        }
          if(isFound==true){
                System.out.println("Element Found at "+index);
            }else{
                  System.out.println("Element not Exist ");
            }
          System.out.println("\nLinear Search with while Loop is below  \n");
        int a=0;int b=nums.length; boolean isWhileFound=false; int newIndex=0;
        while(a<b){
            if(nums[a]==target){
                newIndex=a;
                isWhileFound=true;
                break;
            }
            a++;
        }
             if(isWhileFound==true){
                System.out.println("Element Found at "+newIndex);
            }else{
                  System.out.println("Element not Exist ");
            }    
    }    
}
