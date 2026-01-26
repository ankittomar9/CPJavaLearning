package BasicDSAImplemetations.Strings.Basics;

import java.util.Arrays;

public class Q_1_String_to_lower_case {
    public static void main(String args[]){
       String s1 = "ANKIT_is_LEARNING";
                System.out.println("Original Array String : \n"+s1);

        char arr[]=s1.toCharArray();

        for(int i=0;i<s1.length();i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                  arr[i]=(char) (arr[i]+32);
            }
          
        }   

        String s2=new String(arr);
        System.out.println("\n New Array String : \n"+s2);
        System.out.println(Arrays.toString(arr));
    }
    
}
//TC: O(n)
//SC:O(n) we becuase we need an aux char array to run the conversion logic 
// Can it be done in O(1) no String builder and char array takes same O(n) space