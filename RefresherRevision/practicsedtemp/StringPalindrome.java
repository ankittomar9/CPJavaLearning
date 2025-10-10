package RefresherRevision.practicsedtemp;

public class StringPalindrome {
    public static void main(String args[]){
        String str1="naman"; 
        String str3="Ankit"; String str5="Ankur";String str6="";
        String str4="";
        String  str2="";        int n=str1.length();

        for(int i=0;i<n;i++){

            str2=str2+str1.charAt(i);
            
        }
    //     System.out.println(str2);

        if(str1.equals(str2)){
  //          System.out.println("palindrome String");
        }
        else{
     //       System.out.println(" not a palindrome String");
        }


        for(int j=0;j<str3.length();j++){

           // str4=str4+str3.charAt(j); //Ankit
           // iterate+add
           //add iterate 
             str4=str3.charAt(j)+str4;    
       
        }

      //  System.out.println(str4);
        String str8="";
            
        for(int k=str5.length()-1;k>=0;k--){

           // str4=str4+str3.charAt(j); //Ankur
           // iterate+add
           //add iterate 

           //  str6=str5.charAt(k)+str6;    
           char ch=str5.charAt(k);
           if(ch >= 'a' &&  ch<='z'){
            ch=(char) (ch-32);
            str8+=ch;
           }
           else{
            str8+=ch;
           }
           //System.out.println(str8);
           

           str6=str6+str5.charAt(k);


         
           
       
        }
        String str11=""; String str10="RACECAR";
        for(int a=0;a<str10.length();a++){ //str=racecaer

          char ch1=str10.charAt(a); //racecaer 110>65 && 110<96
           if(ch1 >= 'A' &&  ch1<='Z'){  
            ch1=(char) (ch1+32);
           
           // System.out.println(" If condition : "+str11);
           }
            str11+=ch1;
        //    else{
        //     str1+=ch1;
        //      System.out.println(" else condition : "+str1);
        //    }
        }

        //  if(ch >= 'A' && ch <= 'Z'){
         //       ch = (char)(ch + 32) ;
       //  strNew += ch;

        System.out.println(str11);
//      System.out.println(str1);

    //    System.out.println(str6);

    //    System.out.println(str8);




    }
    
}
