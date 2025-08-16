public class LinearSearch {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        int target=8;
        int serach=linearSearch(arr, target);
        System.out.println(serach);

        if(serach==1){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not Found");
        }
        
    }



    public static int linearSearch(int [] arr, int target){

  if(arr.length==0){
    return -1;
  }

  for(int i=0;i<arr.length;i++){
    if(arr[i] == target){
        return i;
    }
  }
  return -1;



    }
}
