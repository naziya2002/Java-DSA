public class FindMin {

    public static void main(String[] args) {
        int [] arr={100,20,3,56,78,90};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Minimium Number is"+min);

    }
    
}
