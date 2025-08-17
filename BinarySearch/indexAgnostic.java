package BinarySearch;

public class indexAgnostic {
    public static void main(String[] args) {

        int [] arr={9,7,6,3,2,1};
        // int [] arr={1,2,3,4,5,67};
        int target=9;
        int result=Search(arr, target);

        System.out.println(result);
        
    }

    public static int Search(int [] arr, int target){

        int start=0;
        int end=arr.length-1;
        boolean asc=arr[start]<arr[end];

        while(start<=end){
             int mid=start + (end - start) / 2;
             if(target == arr[mid]){
                return mid;
            } 


            if(asc){
                  if(target > arr[mid]){
                start = mid + 1;
            } 
            else {
                end=mid-1;
                 // return index if found
            }

            }else{
                  if(target > arr[mid]){
                end = mid - 1;
            } 
            else {
                start=mid+1;
                 // return index if found
            }

            }
           
        }




        return -1;
    }
    
}
