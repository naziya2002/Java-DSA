package Assignment;
import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=input.nextInt();
        int original = n;
         int result=0;

            while(n!=0){
                int remainder=n%10;
                result=(int) ((int) result+Math.pow(remainder,3));
                n=n/10;

            }
            System.out.println(result);

            if(result==original){
                System.out.println("Number is Armstrong");

            }else{
                System.out.println("Number is not ArmStrong");
            }

            input.close();
    }
    
}
