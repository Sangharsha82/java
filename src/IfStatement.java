import java.util.Scanner;


public class IfStatement {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	  int a;
    	  System.out.println("Enter number");
    	  a= input.nextInt();
    	 if(a<10){
    		 System.out.println(" you can enter number");
    	 }
    	 else{
    		 System.out.println("you cannot enter number");
    	 }
    }
}
