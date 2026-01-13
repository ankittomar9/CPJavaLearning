package dsa_advance.array;

public class Q_17_Arrays_a_b_pairs_brute{
   //Given a String/char array of lowercase a and b 
   //Find the count of pairs(i,j) such that i<j and arr[i]=a and arr[j]=b 
    public static void main(String args[]){
        String s1="dcabbaab";
            int ans=0;
        char arr[]=s1.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]!='a'){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]=='b'){
                    ans++;
                }
            }
        }
        System.out.println("Count of pairs (a,b) can be formed: \n"+ans);


        }
    }

