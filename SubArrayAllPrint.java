public class SubArrayAllPrint {
    public static void main(String args[]){
        int[] arr={2,4,7,3,6,4,12,15,20};
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k]);
                }
                System.out.println();
            }
        }

    }
}


/*
 * 
    int[] arr={2,4,7,3,6,4,12,15,20};

 Output

  2
 2 4
 2 4 7
 2 4 7 3
 2 4 7 3 6
 2 4 7 3 6 4
 2 4 7 3 6 4 12
 2 4 7 3 6 4 12 15
 2 4 7 3 6 4 12 15 20
 4
 4 7
 4 7 3
 4 7 3 6
 4 7 3 6 4
 4 7 3 6 4 12
 4 7 3 6 4 12 15
 4 7 3 6 4 12 15 20
 7
 7 3
 7 3 6
 7 3 6 4
 7 3 6 4 12
 7 3 6 4 12 15
 7 3 6 4 12 15 20
 3
 3 6
 3 6 4
 3 6 4 12
 3 6 4 12 15
 3 6 4 12 15 20
 6
 6 4
 6 4 12
 6 4 12 15
 6 4 12 15 20
 4
 4 12
 4 12 15
 4 12 15 20
 12
 12 15
 12 15 20
 15
 15 20
 20
 */