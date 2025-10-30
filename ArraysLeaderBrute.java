public class ArraysLeaderBrute {
 
    public static void main(String args[]){
       int arr[]={10,7,9,4,3,2}; 
       int ans=0;
       for(int i=0;i<arr.length;i++){
          boolean flag=true;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>=arr[i]){
                flag=false;
                break;
            }
        }
        if(flag){
            ans++;
        }


       }
       System.out.println(ans);

    }
    

}

/*Leaders in a Array
 * 
 * Whats a  Leader:
 * An element that is strictly greater
 *  than all the elements on its right side
 * A[i]> A>[i+1 ... n-1]
 */