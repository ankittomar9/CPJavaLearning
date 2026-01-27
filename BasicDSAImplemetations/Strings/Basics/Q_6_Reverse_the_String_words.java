package BasicDSAImplemetations.Strings.Basics;
import java.util.Arrays;
public class Q_6_Reverse_the_String_words {
    public static void main(String args[]){
        String s1="the sky is blue";
          System.out.println("Original String : "+s1);
        char arr[]=s1.toCharArray();
     
         reverseHelper(arr, 0, arr.length - 1);
         System.out.println(Arrays.toString(arr)); //first reverse String array

                 int start=0; 
            for(int end=0;end<arr.length;end++){
                if (arr[end] == ' ') {
                reverseHelper(arr, start, end - 1);
                start = end + 1; // Move start to the next word
            }
            else if (end == arr.length - 1) {
                reverseHelper(arr, start, end);
            }
         }
        System.out.println("Final Result: " + new String(arr));
    }
  public static void reverseHelper(char arr[],int i,int j){      
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;   j--;
        }
     }    
}
