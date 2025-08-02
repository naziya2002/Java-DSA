import java.util.Scanner;

public class MaxMin{




    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter Fist Number");
 int num1=input.nextInt();

 System.out.println("Enter Second Number");
 int num2=input.nextInt();


 System.out.println("Enter Third Number");
 int num3=input.nextInt();


 int maxNumber=largest(num1, num2, num3);
 int minNumber=Smallest(num1, num2, num3);

 System.out.println("THE LARGEST NUMBER IS " + maxNumber);
 System.out.println("THE SMALLEST NUMBER IS "+ minNumber);
  input.close();


        
    }

    public static int largest(int num1,int num2, int num3){

        int max=num1;
        int min;

        if(num2>max){
             max=num2;

        }
        if(num3>max){
            max=num3;
        }
        return max;

    }


    public static int Smallest(int num1, int num2, int num3){
        int min= num1;

        if(num2<min){
            min=num2;
        }

        if(num3<min){
            min=num3;
        }

        return min;
    }
   
}