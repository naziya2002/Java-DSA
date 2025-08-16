import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // ArrayList <Integer> arr=new ArrayList<>();


        // arr.add(1);

        // // for loop

        // for(int i=0;i<5;i++){
        //     arr.add(input.nextInt());
        // }

        // System.out.println(arr);


        // multiDimentional Array List


        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        // initilization is necessary

        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }


        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }


        System.out.println(list);




        input.close();
    }
}
