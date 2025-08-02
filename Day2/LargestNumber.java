import java.util.Scanner;


public class LargestNumber {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();


        // if(a>b){
        //     if(a>c){
        //         System.out.println("A is Largest Number"+a);
        //     }else{
        //         System.out.println("C is largest"+c);
        //     }
        // }else if(b>c){
        //     System.out.println("B is Largest"+b);

        // }else{
        //     System.out.println("C is Largest"+c);
        // }

        int max=Math.max(Math.max(a,b),c);
        System.out.println(max);

    }
    
}
