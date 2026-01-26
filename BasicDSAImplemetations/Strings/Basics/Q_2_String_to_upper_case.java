package BasicDSAImplemetations.Strings.Basics;

import java.util.Arrays;

public class Q_2_String_to_upper_case {
    public static void main(String args[]){
        String s1="aman_learns_java_streams";
          System.out.println("Original Array String : \n"+s1);
        char arr[]=s1.toCharArray();
    
    
        for(int i=0;i<s1.length();i++){
            if(arr[i]>='a' && arr[i]<='z'){
                  arr[i]=(char) (arr[i]-32);
            }
          
        }     
               String s2=new String(arr);
                System.out.println("\n New Array String : \n"+s2);
                System.out.println(Arrays.toString(arr));

    }
    
}
