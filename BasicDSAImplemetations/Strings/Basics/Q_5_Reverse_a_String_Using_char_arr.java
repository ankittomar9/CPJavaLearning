package BasicDSAImplemetations.Strings.Basics;
import java.util.Arrays;
public class Q_5_Reverse_a_String_Using_char_arr {
    public static void main(String args[]){
        String s1="racecar on water";
            System.out.println("Original String : "+s1);
        /*Do not use this 
        StringBuilder str=new StringBuilder(s1);
        str= str.reverse();
        System.out.println(str); */
        char arr[]=s1.toCharArray();
        int i=0;int j=arr.length-1;

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String reversed=new String(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("New reversed String : "+ reversed);
    }    
}
