import java.util.Scanner;

public class Febonachi {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        int a=0;
        int b=1;
   if(n==0){
     System.out.println(a);
   }else{
    for(int i=0;i<n;i++){
        int tem=0;
         tem=a+b;
        a=b;
        b=tem;
        System.out.println(tem);
        

    }
   }
    }
    
}
