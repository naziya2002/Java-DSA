import java.util.Scanner;

public class EligibleToVote {
    
public static void main(String[] args) {
    
Scanner input= new Scanner(System.in);

System.out.println("Enter the age");

int age=input.nextInt();

String result=VoteEligibility(age);

System.out.println(result);


}


public static String VoteEligibility(int age){
 String result;

 if(age>=18){
    result="Eligible to Vote";
 }else{
    result= " Not Eligible to Vote";
 }




 return result;



}

}
