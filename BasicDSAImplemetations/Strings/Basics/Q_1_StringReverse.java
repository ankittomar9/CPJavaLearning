package basicDSAImplemetations.Strings.Basics;
import java.util.Arrays;
public class Q_1_StringReverse {
    public static void main(String args[]){
        String s1="Ankit is Studying DSA";
        System.out.println(s1); 
         // don't need loop here why because 
        // s1 is not primitve datatype rather then a string class object
        // char [] is different from string
        System.out.println(s1.charAt(2)); 
        //Strings are immutable 
        char string_arr[]=s1.toCharArray();
   
        // to reverse we need to have two pointers i and j at 0 and n-1
        int i=0;int j=s1.length()-1;
        while(i<=j){
            
            char temp=string_arr[i];
            string_arr[i]=string_arr[j];
            string_arr[j]=temp;
            
            i++;
            j--;
        }
        String stringReversed= new String(string_arr);

        System.out.println("Reversed String : "+Arrays.toString(string_arr));
           System.out.println("Reversed String : 2 \n"+ stringReversed);
   
   
    }
    
}
