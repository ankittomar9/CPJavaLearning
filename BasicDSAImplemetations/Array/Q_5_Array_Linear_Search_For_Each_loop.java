package BasicDSAImplemetations.Array;

public class Q_5_Array_Linear_Search_For_Each_loop {
    // Q_5_Array_Linear_Search_For_Each_loop
    public static void main(String args[]){
        int nums[]={10,60,30,70,80,20};
        int target=80;
        boolean isFound=false;
        int count=0; // Since for each loop doesn't have index we use count as Index
        for(int variable:nums){
            if(variable==target){
                   System.out.println(variable); // how it got 80 whats the magic
                isFound=true;
                break;
            }
             count++;
        }
        if(isFound==true){
             System.out.println("Element exist at : "+count);
        }else{
                 System.out.println("Element doesn't exist  : ");
        }       
    }    
}
