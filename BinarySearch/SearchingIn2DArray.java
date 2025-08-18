package BinarySearch;

public class SearchingIn2DArray {
    

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{5,6,7}};
        int target=0;
    int result=Search(arr, target);
    if(result==-1){
        System.out.println("Element Not Found");
    }else{
        System.out.println("Element Found"+result);
    }
        
    }

    public static int Search(int[][] arr, int target){

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
   
       if(arr[row][col]==target){
        return arr[row][col];
       }

            }
        }



     



        return -1;
    }
}
