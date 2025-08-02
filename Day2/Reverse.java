import java.util.Scanner;


public class Reverse {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       int rev=0;
       while(n!=0){
       int  remainder=n%10;
         rev=rev*10+remainder;

         System.out.println(rev);

         n=n/10;
       
       }
       System.out.println(rev);


    }

}
