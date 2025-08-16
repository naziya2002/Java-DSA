public class SearchInRagnge {


    public static void main(String[] args) {

         int [] arr={1,2,3,4,5};
        int target=8;
        int serach=linearSearch(arr, target,2,4);
        System.out.println(serach);

        if(serach==1){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not Found");
        }
        
    }


      public static int linearSearch(int [] arr, int target,int start,int end){

  if(arr.length==0){
    return -1;
  }

  for(int i=start;i<end;i++){
    if(arr[i] == target){
        return i;
    }
  }
  return -1;



    }

    
}
