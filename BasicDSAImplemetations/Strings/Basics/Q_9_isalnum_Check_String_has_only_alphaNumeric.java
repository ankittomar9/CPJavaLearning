package BasicDSAImplemetations.Strings.Basics;

public class Q_9_isalnum_Check_String_has_only_alphaNumeric {
    public static void main(String args[]){
        /*check if a string consists only of alphanumeric characters.
        Alphanumeric means: A-Z, a-z, or 0-9.  */
        boolean isViolated=false;
       // String s1="ankitlearnswell";
        String s1="Ankit@learns_java";
        if(s1==null || s1.length()==0 ){
           System.out.println("Invalid Input or Arrays is empty");return;        }
        char arr[]=s1.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z' ||arr[i]>='0' && arr[i]<='9' ){
                continue;
            }else{
                isViolated=true;
                  System.out.println("String has special character : "+arr[i]+" at " +i);
                break;
            }
        }
        if(!isViolated){
             System.out.println("String Only Consists of AlphaNumeric Character");
        }     
       
    }  
    
}
/*T:C is O(n)

SC:O(n) becuase of charr array
 */