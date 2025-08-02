import java.util.Scanner;

public class Conditionals{
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int n=input.nextInt();
        while(n!=0){
            System.out.println(n);
            n--;
        }
    }
}