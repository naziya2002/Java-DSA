package BinarySearch;

public class InfinteArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,3,4,4,5,5,6,7,8,8,9,90,101,105};
        int target=105;
        int end=2;
        int start=0;
        int result=Search(target, arr, end,start);

        while(result== -1){
            start=end;
            end=end*end;
            result=Search(target, arr, end, start);
            System.out.println(result);
        }
        
    }

    public static int Search(int target, int[] arr,int end, int start){

        
      
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } 
            else if(target > arr[mid]){
                start = mid + 1;
            } 
            else {
                return mid; // return index if found
            }
            
        }





        return -1;


    }
}
