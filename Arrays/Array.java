import java.util.Arrays;
import java.util.Scanner;

public class Array {
    
 public static void main(String[] args) {
    

Scanner input= new Scanner(System.in);

// datatye [] variable_name=new  datatype[size of array]

int [] arr= new int[5];

// arr[0]=1;
// arr[2]=3;
int[] arr2={1,2,3,4,50};

// input using for loop

for(int i=0;i<arr.length;i++){
    arr[i]= input.nextInt();

}

// output the array 


for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);

}

// System.out.println(arr2[2]);
System.out.println(Arrays.toString(arr2));


input.close();

 }


}
