package BasicDSAImplemetations.Strings.Basics;

public class Q_10_String_Operations_concatenate_replace {
    public static void main(String args[]){
            /*Given a string A, concatenate it with itself to form a new string. From this new string,
             remove all uppercase letters and replace every vowel ('a', 'e', 'i', 'o', 'u') with '#'. */
                String s1="AbcaZeoB";
                //Expected output AbcaZeoB+AbcaZeoB = AbcaZeoBAbcaZeoB final String
                //  bc###bc###  

                StringBuilder sb=new StringBuilder();
                    
                for(int i=0;i<s1.length();i++){
                    char c=s1.charAt(i);
                    if(c>='A' && c<='Z'){
                        continue;
                    }
                    if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                        sb.append('#');
                    }else{
                        sb.append(c);
                    }
                }
                System.out.println("\nNew Modified String \n"+sb);
   
                String processed=sb.toString();
                String finalResult=processed+processed;
                 System.out.println("\nNew Modified String Final Concatenated \n"+finalResult);
     }
    
}
