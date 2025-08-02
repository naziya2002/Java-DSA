import java.util.Scanner;

public class EvenOddChecker {
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=input.nextInt();
        String result=NumberChecker(num);
        System.out.println(result);

    }

    public static String NumberChecker(int num){
        String result;

        if(num%2==0){
            result="Number is Even";
        }else{
            result="Number is ODD";
        }


        return result;

    }
}
