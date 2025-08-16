import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        
// 2d array syntax
int [][] arr=new int[3][4];


// taking input

for(int row=0;row<arr.length;row++){

    for(int col=0;col<arr[row].length;col++){
        arr[row][col]=input.nextInt();
    }
}

// for each loop

for( int[] num:arr){

    System.out.println(Arrays.toString(num));

}


    }
    
}
