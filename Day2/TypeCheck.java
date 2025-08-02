import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Small Letter");
        }else{
            System.out.println(" Capital Letter");
        }

    }
}
