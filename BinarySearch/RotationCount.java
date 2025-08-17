package BinarySearch;

public class RotationCount {



    public static void main(String[] args) {

        int[] arr={5,6,7,2,3,4,5};
        

        int result=pivot(arr);
    

        System.out.println(result+1);

    }


    public static int pivot(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<=end){

        int mid=start+(end-start)/2;

        /// check if mid is pivot
        if(mid<end && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid>0 && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[start]<=arr[mid]){
            start=mid+1;
        }else{
             end=mid-1;
        }




        }
    




        return -1;
    }
    
}
