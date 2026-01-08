package dsa_advance.array;

public class Q_15_Arrays_Equilibrium_index_brute {
    public static void main(String args[]){
        int arr[]={-7,1,5,2,-4,3,0};
        //What is Equilibrium Index Index which has left sum and right sum equal
        //Calculate left sum and right sum
        //left sum range 0 to i-1 // right sum range i+1 to n-1
            boolean isFound=false;
        //Left sum
        for(int i=0;i<arr.length;i++){
               //Left sum
            int leftSum=0;
            for(int j=0;j<i;j++){
                  leftSum=leftSum+arr[j];
            }

            //right sum
            int rightSum=0;
            for(int j=i+1;j<arr.length;j++){
                rightSum+=arr[j];
            }

            if(leftSum==rightSum){
                System.out.println("Equilibrium index found at "+i);
                System.out.println("Left Sum "+leftSum+" == "+rightSum +" Right Sum");
                isFound=true;
                break;
            }
          
        }
          if(isFound==false){
                System.out.println("Equilibrium index Does not exists" );
            }
    }
}
