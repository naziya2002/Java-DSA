import java.util.Scanner;

public class PythogrousTriplet {
//  public static void main()

 public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    System.out.println("Enter three numbers");
    int num1=input.nextInt();
    int num2=input.nextInt();
    int num3=input.nextInt();
 Pythog(num1, num2, num3);




    input.close();



    
 }

 public static void Pythog(int num1, int num2, int num3){

    if(num1*num1== num2*num2 + num3*num3){
        System.out.println("Pythogouse Triplet");
    }else if(num2*num2== num1*num1 + num3*num3 ){
        System.out.println("Pythogouse Triplet");
    }else if(num3*num3== num1*num1 + num2*num2 ){
                System.out.println("Pythogouse Triplet");
    }else{
        System.out.println("Not a pythogrous Triplet");
    }


 }


    
}
