import java.util.Scanner;


public class NestedIf {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	 int marks;
    	 System.out.println("Enter your marks");
    	  marks =input.nextInt();
    	   if(marks>=90){
    		   System.out.println("You have got A+");
    	   }
    	   else if(marks>=40){
    		   System.out.println("you are pass");
    	   }
    	   else{
    		   System.out.println("you are fail");
    	   }
    }
}
