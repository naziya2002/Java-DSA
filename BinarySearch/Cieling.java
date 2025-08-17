package BinarySearch;

public abstract class Cieling {
    
public static void main(String[] args) {
    int[] arr={1,5,6,7,14,16,96};
    int target=15;
    int result=Search(arr, target);
    System.out.println(result);
    
}

// cieling: smallest number greater than or equal to target
// floor : gretest number in array smaller than or equal to target.

public static int Search(int[] arr,int target){
    int start=0;
    int end=arr.length-1;

    while(start<=end){
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return arr[mid];
        }else if(target>arr[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }


    return arr[start];

    // return arr[end] for floor number
}

}




//

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
// class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//        int start=0;
//        int end =findPeakValue(mountainArr);
       
      
       
//        while(start<=end){
//         int mid= start+(end-start)/2;
//         if(target==mountainArr.get(mid) ){
//             return mid;
//         }else if(target>mountainArr.get(mid)){
//             start=mid+1;
//         }else{
//             end=mid-1;
//         }
//        }
//        return -1;
        
//     }

//     public int findPeakValue(MountainArray mountainArr){
//          int start=0;
//         int end=mountainArr.length()-1;
//         while(start<end){
//             int mid= start+(end-start)/2;

//             if(mountainArr.get(mid)>mountainArr.get(mid+1)){
//                 end=mid;

//             }else{
//                 start=mid+1;
//             }
//         }
//         return start;

//     }
// }
