package dsa_advance.array;
public class Q_54_Majority_element {
    public static void main(String args[]){
        int arr[]={2,2,1,1,1,2,2}; // n=7 majority is n/2 which is 7/2= 3.5 =3
        //This questions solved by Moore Voting algorithm
        if(arr.length==0 ){            System.out.println("Empty array");return ;      }
        int count=0;        int candidate=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
            // Edge case Verification is array is necessary
            int freqCounter=0;
            for(int i=0;i<n;i++){
                //what if no element is majority element all elements are distinct  or in less or equal number
                if(arr[i]==candidate){
                    freqCounter++;
                }
            }
            if (freqCounter > n/2) {
            System.out.println("Majority Element is: " + candidate);
        } else {
            System.out.println("No Majority Element found");
        }
    }
    
}
