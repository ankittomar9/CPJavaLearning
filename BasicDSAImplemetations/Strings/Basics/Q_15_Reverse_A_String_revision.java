package basicDSAImplemetations.Strings.Basics;

import java.util.Arrays;

public class Q_15_Reverse_A_String_revision {
    public static void main(String args[]){
      String s1="String are Immmutable"; //why? 

        char arr[]=s1.toCharArray();
        int i=0; int j=arr.length-1;

        while(i<j){
            
            char temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;           
                        
            i++;
            j--;
        }


        System.out.println("Char Array reverse: \n"+Arrays.toString(arr));
        String reversed=new String(arr);

            System.out.println(" String revverse: \n"+reversed);


    }
    
}
