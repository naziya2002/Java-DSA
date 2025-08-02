import java.util.Scanner;


public interface Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    System.out.println("Enter Number to check for prime");
  int num=input.nextInt();

isPrime(num);

input.close();

    }


    public static void isPrime(int num){
  

        if( num==0 || num== 1 ){
            System.out.println("Not a prime Number");
        }

 for(int i=2;i<num; i++){
    if(num%i ==0){
        System.out.println("Not a Prime NUMBER");
        break;

    }else{
          System.out.println("Prime Number");
          break;
    }
  
    
 }

    }
}
