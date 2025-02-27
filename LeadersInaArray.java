public class LeadersInaArray {
    public static void main(String args[]){
        int ans=0;
        //int arr[]={8,-2,7,6,5 ,1};
        int arr[]={8,-2,7,6,5 ,1};

        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    flag=false;
                    break;
                }
            }
           if(flag) ans++;
        }
        System.out.println("Leaders in the Array : "+ans);
    }
}

/*
 int arr[]={8,-2,7,6,5 ,1};

 
 */