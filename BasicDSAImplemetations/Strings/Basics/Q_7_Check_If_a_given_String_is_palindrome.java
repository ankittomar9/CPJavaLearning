package BasicDSAImplemetations.Strings.Basics;
public class Q_7_Check_If_a_given_String_is_palindrome {
    public static void main(String args[]){
        //String s1="naman"; 
        String s1="aman"; //for false case
        if(s1==null || s1.length()==0){
            System.out.println("String is null || or empty ");  return;      }

         System.out.println("Original String : \n"+s1);
        String reversed="";
        for(int i=s1.length()-1;i>=0;i--){
            reversed=reversed+s1.charAt(i);
        }

        System.out.println("Reversed String : \n"+reversed);

  //don't do this s1==reversed it fails because
  //   == compares primitive and object data types
        if(s1.equals(reversed)){
            System.out.println("Given String is Palindromic");
        }else{
             System.out.println("Given String is not Palindromic");
        }
    }    
}
