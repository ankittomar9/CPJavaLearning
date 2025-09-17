public class ElementGreaterThanItself {
public static void main(String args[]){
        //int arr[]={2,5,1,4,8,0,8,1,3,8};
        int arr[]={1,4,9,3,4,1,6 ,7 };
        int count=0; int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                //max=Max(arr[i],max)
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println(" The elements are "+(arr.length-count));

    }
    
}


/*Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.
First and only argument is an array of integers A.
Return the count of elements. 

Approach : condition 1 element greater than itself
count 

array : 1 4 9  3  4  1 6 7 

 1 max element O(n) 
 1.1 traverse array  check whether the current element is greater than than max if not increase the counter 
 else 

 2 sort array last maximum O(nlogn)


*/