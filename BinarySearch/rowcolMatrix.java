package BinarySearch;

import java.util.Arrays;

public class rowcolMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,5,6},{8,9,11,15}};
        int target=9;
        String result=Arrays.toString(Search(arr, target));

        System.out.println(result);

        
    }

    public static int[] Search(int[][] arr, int target){

        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }else if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }



        return new int[]{-1,-1};
    }
}
