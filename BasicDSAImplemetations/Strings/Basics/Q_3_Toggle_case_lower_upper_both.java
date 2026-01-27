package BasicDSAImplemetations.Strings.Basics;

import java.util.Arrays;

public class Q_3_Toggle_case_lower_upper_both {
    public static void main(String args[]){
           String s1="Aman_Learns_Streams_LAMBDAS";
              System.out.println("Original Array String : \n"+s1);
           char arr[]=s1.toCharArray();

           for(int i=0;i<arr.length;i++){
            if(arr[i]>='a'&& arr[i]<='z'){
                 arr[i]= (char) (arr[i]-32);
            }
            else if (arr[i]>='A' && arr[i]<='Z'){
                    arr[i]= (char) (arr[i]+32);
            }
        }

         String newString= new String(arr);

          System.out.println("\n New Array String : \n"+newString);
                System.out.println(Arrays.toString(arr));
    
    
    }
    
}
