package dsa_advance.array;

import java.util.Arrays;

public class Q_16_Arrays_Product_puzzle_brute {
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        //he Problem: Given an array nums of size n,
        //  return an array res such that res[i] is equal to the product of all the elements of nums except nums[i].
        //output expected nums[]=[24,12,8,6]
        //skip nums[i] and do product of every other element
        // for example nums[0]=1 arr={2*3*4=24} similar like that
        int result[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int product=1;
            if(nums[i]==0){
                System.out.println("Mutliplication with 0 is Zero ");
                break;
            }
            for(int j=0;j<nums.length;j++){
            if(i==j){
                continue;
            }
            product=product*nums[j];
            }
            result[i]=product;
        }

       System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Result:   " + Arrays.toString(result));
    }
    
}
