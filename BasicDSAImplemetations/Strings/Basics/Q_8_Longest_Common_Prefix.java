package BasicDSAImplemetations.Strings.Basics;
public class Q_8_Longest_Common_Prefix {
    public static void main(String args[]){
/*Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc". 
     */
        //  String arr[] = {"abcdefgh", "abcefgh", "abcdgg","abchhf","dfaabc","dfabcef"};
           String arr[] = {"abcdefgh", "abcefgh", "abcdgg","abchhf"};
        if(arr.length==0 ||arr==null){
             System.out.println("Invalid Input or Arrays is empty");return;}

    // System.out.println(arr[0]); System.out.println(arr[1]); System.out.println(arr[2]);
    // System.out.println(Arrays.toString(arr));
            
            String prefix=arr[0];

            for(int i=1;i<arr.length;i++){
                while(arr[i].indexOf(prefix)!=0){

                    prefix=prefix.substring(0,prefix.length()-1);

                    if(prefix.isEmpty()){
                        System.out.println("Common Prefix: (empty)");
                    return;
                    }
                }
            }
            System.out.println("Longest Common Prefix: " + prefix);
        }    
}
